package datastructure;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> list = new HashMap<String, List<String>>();

		HashMap<Object, Object> map = new HashMap<>();
		map.put(2120, "MAZ");
		map.put(2038, "ADAM");
		map.put(8467, "BRUCE");


		Iterator<Object> mapIt = map.keySet().iterator();
		Object key;
		while (mapIt.hasNext()) {
			key = mapIt.next();
			System.out.println("KEY: " + key);
			System.out.println("VALUE: " + map.get(key));
		}

		String tableName = "`test_hash_map`";
		ConnectToSqlDB sql = new ConnectToSqlDB();

		try {
			sql.insertDataFromMap(tableName, map);
			System.out.println(sql.readDataBase(tableName));
			sql.updateDataInTable(tableName, "8467", "BRUCE WALTERS");
			System.out.println(sql.readDataBase(tableName));
			sql.deleteRow(tableName, "8467");
			System.out.println(sql.readDataBase(tableName));
		} catch (SQLException e) {
			System.out.println("SQL Exception: " + e.getMessage());
		}

	}

}
