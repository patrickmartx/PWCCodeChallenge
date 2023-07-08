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
	}

}
