package sorting;

import java.util.TreeSet;

public class SortingAlphabeticalOrder {

	public static void main(String[] args) {
		EmpolyeeCitySorting city = new EmpolyeeCitySorting();

		TreeSet<Empolyee> treeset1 = new TreeSet<Empolyee>(city);

		Empolyee emp1 = new Empolyee(123, "Raj", "Pune", 12000);
		Empolyee emp2 = new Empolyee(122, "Dev", "Thane", 15000);
		Empolyee emp3 = new Empolyee(154, "Bobby", "Pune", 10000);
		Empolyee emp4 = new Empolyee(174, "Ram", "Mumbai", 18000);

		treeset1.add(emp1);
		treeset1.add(emp2);
		treeset1.add(emp3);
		treeset1.add(emp4);

		System.out.println("Sorting by City: " + treeset1);
		System.out.println("Sorting Alphabetical Order Last Occurrence:" + treeset1.last());
		System.out.println("Sorting Alphabetical Order First Occurrence:" + treeset1.first());

	}

}
