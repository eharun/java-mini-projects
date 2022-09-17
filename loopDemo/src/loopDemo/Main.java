package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For loop.
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("For loop is finished.");
		// While loop.
		int i = 2;
		while(i < 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While loop is finished.");
		// Do-While loop. If the condition is not met, it works once. Otherwise, works like a while loop.
		int j = 100;
		do {
			System.out.println(j);
			j+=2; 
		} while(j < 10);
		System.out.println("Do-While loop is finished.");
	}

}