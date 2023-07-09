public class Main {

	public static void main(String[] args) {
		manipulateString stringOp = new manipulateString();
		
		// Desafio 1
		String firstInput = "Hello, World! OpenAI is amazing.";
		stringOp.printInReverseOrder(firstInput);
		
		System.out.println();
		
		// Desafio 2
		String secondInput = "Hello, World!";
		stringOp.printNoRepeatChar(secondInput);
		
		System.out.println();
		
		// Desafio 3
		String thirdInput = "babad";
		stringOp.printSubstringLongestPalindrome(thirdInput);
		
		System.out.println();
		
		// Desafio 4
		String fourthInput = "hello. how are you? i'm fine, thank you.";
		stringOp.capitalizeFirstLetter(fourthInput);
		
		System.out.println();
		
		// Desafio 5
		String fifthInput = "racecar";
		stringOp.isAnagramOfPalindrome(fifthInput);
	}

}
