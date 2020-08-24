package interfaces;

public class StudentsCompareName implements Comperator{
	public int compare(Object o1, Object o2) {
		String name1, name2;
		 name1 = ((Student)o1).name;
		 name2 = ((Student)o2).name;
		 return name1.compareTo(name2);
	}

}
