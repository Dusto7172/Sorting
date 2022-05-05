package sorting;

import java.util.Comparator;

public class EmpolyeeCitySorting implements Comparator<Empolyee> {

	@Override
	public int compare(Empolyee e1, Empolyee e2) {
		return e1.city.compareTo(e2.city);	
	}
	

}
