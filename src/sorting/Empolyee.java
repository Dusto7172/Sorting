package sorting;

public class Empolyee {
	int id;
	String Name;
	String city;
	int salary;
	
	public Empolyee() {
		super();
	}

	public Empolyee(int id, String name, String city, int salary) {
		super();
		this.id = id;
		Name = name;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", Name=" + Name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	

}
