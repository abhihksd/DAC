package utility;

import interfaces.Comparer;
import people.Student;

public class NameCompare implements Comparer {
	public int compare(Object o1, Object o2) {
		Student s1 = null, s2 = null;
		if (o1 instanceof Student) {
			s1 = (Student) o1;
		}
		if (o2 instanceof Student) {
			s2 = (Student) o2;

		}
		return s1.getName().compareTo(s2.getName());
	}
}
