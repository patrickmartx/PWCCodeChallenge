public class manipulaString {
	// Desafio 1
	public static void printaEmOrdemInvertida(String frase) {
		String[] palavras = frase.split(" ");
		for (int posicaoPalavra = palavras.length - 1; posicaoPalavra >= 0; posicaoPalavra--) {
			System.out.print(palavras[posicaoPalavra] + " ");
		}
		System.out.println();
	}

}
