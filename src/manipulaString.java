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
	@Override
	public void printaSemRepeticaoDeCaractere(String frase) {
		StringBuilder fraseSemRepeticao = new StringBuilder();
		for (int posicaoLetra = 0; posicaoLetra < frase.length(); posicaoLetra++) {
			char caractereAtual = frase.charAt(posicaoLetra);
			// Se o caractere não se encontra em nenhuma posição de fraseSemRepeticao.
			if (fraseSemRepeticao.indexOf(String.valueOf(caractereAtual)) == -1) {
				fraseSemRepeticao.append(caractereAtual);
			}
		}
		System.out.println(fraseSemRepeticao);
	}
}
