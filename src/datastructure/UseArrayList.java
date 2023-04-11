package datastructure;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> arrayList=new ArrayList<String>();

		arrayList.add("Mike");
		arrayList.add("George");
		arrayList.add("Wendy");
		arrayList.add("Jordan");
		arrayList.add("Vanessa");
		arrayList.add("Will");

		arrayList.add(2,"Steven");
		arrayList.remove(1);
		System.out.println(arrayList);


	}

}
