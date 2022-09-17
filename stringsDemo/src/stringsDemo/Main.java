package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "Hello.";
		String message2 = "How are you?";
		System.out.println(message);
		System.out.println("Number of characters : " + message.length());
		System.out.println("5th character : " + message.charAt(4));
		System.out.println(message.concat(" How are you?"));
		System.out.println(message.startsWith("H"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[5];
		message.getChars( 0,  5, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("el"));
		System.out.println(message.lastIndexOf("l"));
		
		String newMessage = message.replace('.', ' ');
		System.out.println(newMessage);
		System.out.println(message.substring(2, 5));
		System.out.println(message.substring(3));
		
		for(String word : message2.split(" ")) {
			System.out.println(word);
		}
		
		// Lower Case and Upper Case
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		// trim
		System.out.println(message.trim());
	}

}
