package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 270;
		int number2 = 25;
		int number3 = 26;
		int maxNumber = number1;
		
		if(maxNumber < number2) {
			maxNumber = number2;
		}
		
		if(maxNumber < number3) {
			maxNumber = number3;
		}
		
		System.out.println("Max. Number is " + maxNumber);
	}

}
