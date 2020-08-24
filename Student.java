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



	//This method returns 0 if the id's are identical, or 1 if otherID is shorter, or -1 if otherID is longer.
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
