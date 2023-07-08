public class manipulaString implements ImanipulaString {
	
	public void manipulaString() {};
	
	// Desafio 1
	@Override
	public void printaEmOrdemInvertida(String frase) {
		String[] palavras = frase.split(" ");
		for (int posicaoPalavra = palavras.length - 1; posicaoPalavra >= 0; posicaoPalavra--) {
			System.out.print(palavras[posicaoPalavra] + " ");
		}
		System.out.println();
	}
		
	// Desafio 2
}
