package miniProjectFindNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int numberToFind = 6;
		boolean isOk = false;
		
		// Looking for numberToFind into array.
		for (int number : numbers) {
			if(number == numberToFind) {
				isOk = true;
				break;
			}
		}
		
		if(isOk) {
			System.out.println("The array contains " + numberToFind + ".");
		} else {
			System.out.println("The array does not contains " + numberToFind + ".");
		}
	}

}