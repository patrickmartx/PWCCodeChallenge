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
	
	// Desafio 3
	public boolean eUmPalindromo(String caracteres) {
		/*
		 * Método para descobrir se a palavra ou frase é um palíndromo.
		 */
		int posicaoLetraAEsquerda = 0;
		int posicaoLetraADireita = caracteres.length() - 1;
		
		while (posicaoLetraAEsquerda < posicaoLetraADireita) {
			if (caracteres.charAt(posicaoLetraAEsquerda) != caracteres.charAt(posicaoLetraADireita)) {
				return false;
			}
			posicaoLetraAEsquerda++;
			posicaoLetraADireita--;
		}
		return true;
	}
	
	@Override
	public void printaSubstringPalindromaMaisLonga(String frase) {
		String maiorPalindromo = "";
        for (int letraInicial = 0; letraInicial < frase.length(); letraInicial++) {
            for (int letraFinal = letraInicial + 1; letraFinal <= frase.length(); letraFinal++) {
            	// Cria um texto que inicia na letraInicial e termina em letraFinal e compara se esse subtexto é um palindromo e se ele tem mais letras do que o palíndromo já adicionado.
                String substexto = frase.substring(letraInicial, letraFinal).toLowerCase();
                if (eUmPalindromo(substexto) && substexto.length() > maiorPalindromo.length()) {
                    maiorPalindromo = substexto;
                }
            }
        }

        System.out.println(maiorPalindromo);
	}
	
	// Desafio 4
	@Override
	public void printaPrimeiraLetraCapitalizada(String frase) {
		StringBuilder fraseCapitalizada = new StringBuilder();
		boolean maiuscula = true;
		
		for (char caractere : frase.toCharArray()) {
			// Se maiuscula está acionado e é um caractere alfabético (não número ou ponto).
			if (maiuscula && Character.isAlphabetic(caractere)) {
				fraseCapitalizada.append(Character.toUpperCase(caractere));
				maiuscula = false;
				} 
			else {
				fraseCapitalizada.append(caractere);
			}
			
			// Maiuscula aciona quando há alguns desses pontos.
			if (caractere == '.' || caractere == '?' || caractere == '!') {
                maiuscula = true;
            }
		}
		System.out.println(fraseCapitalizada);
	}
	
}
