package sorting;

import java.util.Comparator;

public class EmpolyeeSalarySorting implements Comparator<Empolyee> {

	@Override
	public int compare(Empolyee e1, Empolyee e2) {

		if (e1.salary == e2.salary)
			return 0;
		else if (e1.salary > e2.salary)
			return 1;
		else
			return -1;
	}

}
