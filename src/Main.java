public class Main {

	public static void main(String[] args) {
		manipulaString operacaoEmString = new manipulaString();
		
		// Desafio 1
		String firstInput = "Hello, World! OpenAI is amazing.";
		operacaoEmString.printaEmOrdemInvertida(firstInput);
		
		System.out.println();
		
		// Desafio 2
		String secondInput = "Hello, World!";
		operacaoEmString.printaSemRepeticaoDeCaractere(secondInput);
		
		System.out.println();
		
		// Desafio 3
		String thirdInput = "babad";
		operacaoEmString.printaSubstringPalindromaMaisLonga(thirdInput);
		
		System.out.println();
		
		// Desafio 4
		String fourthInput = "hello. how are you? i'm fine, thank you.";
		operacaoEmString.printaPrimeiraLetraCapitalizada(fourthInput);
		
		System.out.println();
		
		// Desafio 5
		String fifthInput = "r a c ecar";
		operacaoEmString.verificaSeEAnagramaDePalindromo(fifthInput);
	}

}
