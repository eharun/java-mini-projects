package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1="Name1";
		String student2="Name2";
		String student3="Name3";
		String student4="Name4";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println("---------------------------------------");
		
		String[] students = new String[4];
		students[0]="Name1";
		students[1]="Name2";
		students[2]="Name3";
		students[3]="Name4";
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("---------------------------------------");
		
		for(String student : students) {
			System.out.println(student);
		}
	}

}