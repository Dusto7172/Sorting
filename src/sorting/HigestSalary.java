package sorting;

import java.util.TreeSet;

public class HigestSalary {
	

	public static void main(String[] args) {
		EmpolyeeSalarySorting salary = new EmpolyeeSalarySorting();
		
		
		TreeSet<Empolyee> treeset = new TreeSet<Empolyee>(salary);
		
		Empolyee emp1 = new Empolyee(123, "Raj", "Pune", 12000);
		Empolyee emp2 = new Empolyee(122, "Dev", "Thane", 15000);
		Empolyee emp3 = new Empolyee(154, "Bobby", "Pune", 10000);
		Empolyee emp4 = new Empolyee(174, "Ram", "Mumbai", 18000);

		treeset.add(emp1);
		treeset.add(emp2);
		treeset.add(emp3);
		treeset.add(emp4);
		
		System.out.println("Sorting by Salary: " + treeset);
		System.out.println("Higest Salary:"+treeset.last());
		System.out.println("Lowest Salary:"+treeset.first());
		
			
	}
	
	
	
	

}
