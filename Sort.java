package interfaces;

public class Sort {
	
public static void main(String[] args) {
		Student[] myStudents = new Student[10];
		int studentsID[] = {24,97,78,47,98,85,54,91,40,86};
		String studentsNames[] = {"ben", "dan", "finn", "dean", "annie", "simon", "fiona", "venessa", "bella", "gaya"};
		int i;
		for(i=0; i<10 ; i++) {
				Student student = new Student(studentsNames[i], studentsID[i]);
				myStudents[i] = student;
				System.out.println(student.toString());
		}
		System.out.println(myStudents[3]);
		insertionSort(myStudents);
		for(i=0; i<10 ; i++) {
			System.out.println(myStudents[i].id);
		}
	}
	
	public static void insertionSort(Comperable[] array) {
		int i, j;
		Comperable temp;
		
		for (i=1; i<array.length; i++) {
			j=i;
			while(j>0 && array[j].compareTo(array[j-1])<0) {
				temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j = j-1;
			}
		}
	}

	
	

}
