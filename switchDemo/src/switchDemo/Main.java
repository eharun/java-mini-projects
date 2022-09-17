package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Passed. Grade : " + grade);
			break;
		case 'B':
			System.out.println("Passed. Grade : " + grade);
			break;
		case 'C':
			System.out.println("Passed. Grade : " + grade);
			break;
		case 'D':
			System.out.println("Passed. Grade : " + grade);
			break;
		case 'F':
			System.out.println("Failed. Grade : " + grade);
			break;
		default:
			System.out.println("Invalid Grade.");
		}
	}

}
