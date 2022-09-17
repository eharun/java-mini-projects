package miniProjectVowels;

public class Main {

	public static void main(String[] args) {
		char character = 'a';
		char upperCaseCharacter = Character.toUpperCase(character);
		switch (upperCaseCharacter) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(upperCaseCharacter + " is a vowel.");
			break;
		default:
			System.out.println(upperCaseCharacter + " is not a vowel.");
		}
	}

}
