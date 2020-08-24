package interfaces;

public class Student implements Comperable{
	
	public String name;
	public int id;
	
	public Student(String name, int id) {
		this.name = name; 
		this.id = id;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}



	public int compareTo(Object other) {
		int otherID;
		int compareAns = 0;
		otherID = ((Student)other).id;
		if(this.id < otherID) {
			compareAns = -1;
		}
		if(this.id > otherID) {
			compareAns = 1;
		}
		return compareAns;
	}

}
