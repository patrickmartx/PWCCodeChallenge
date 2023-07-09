import java.util.Map;
import java.util.HashMap;

public class manipulateString implements ImanipulateString {
	// @author Patrick Martins
	
	public void manipulateString() {};
	
	// Desafio 1
	@Override
	public void printInReverseOrder(String text) {
		String[] words = text.split(" ");
		
		for (int wordPosition = words.length - 1; wordPosition >= 0; wordPosition--) {
			System.out.print(words[wordPosition] + " ");
		}
		System.out.println();
	}
		
	// Desafio 2
	@Override
	public void printNoRepeatChar(String text) {
		StringBuilder textWithNoRepeatChar = new StringBuilder();
		
		for (int wordPosition = 0; wordPosition < text.length(); wordPosition++) {
			char currentChar = text.charAt(wordPosition);
			// Se o caractere não se encontra em nenhuma posição de textWithNoRepeatChar.
			if (textWithNoRepeatChar.indexOf(String.valueOf(currentChar)) == -1) {
				textWithNoRepeatChar.append(currentChar);
			}
		}
		System.out.println(textWithNoRepeatChar);
	}
	
	// Desafio 3
	public boolean isPalindrome(String word) {
		/*
		 * Método para descobrir se a palavra ou frase é um palíndromo.
		 */
		int letterPositionLeft = 0;
		int letterPositionRight = word.length() - 1;
		
		while (letterPositionLeft < letterPositionRight) {
			if (word.charAt(letterPositionLeft) != word.charAt(letterPositionRight)) {
				return false;
			}
			letterPositionLeft++;
			letterPositionRight--;
		}
		return true;
	}
	
	@Override
	public void printSubstringLongestPalindrome(String text) {
		String longestPalindrome = "";
		
        for (int initialLetter = 0; initialLetter < text.length(); initialLetter++) {
            for (int finalLetter = initialLetter + 1; finalLetter <= text.length(); finalLetter++) {
            	// Cria um texto que inicia em initialLetter e termina em finalLetter. Compara se esse subtexto é um palíndromo e se ele tem mais letras do que o palíndromo já adicionado.
                String generatedWord = text.substring(initialLetter, finalLetter).toLowerCase();
                if (isPalindrome(generatedWord) && generatedWord.length() > longestPalindrome.length()) {
                    longestPalindrome = generatedWord;
                }
            }
        }
        System.out.println(longestPalindrome);
	}
	
	// Desafio 4
	@Override
	public void capitalizeFirstLetter(String text) {
		StringBuilder capitalizedText = new StringBuilder();
		boolean capitalize = true;
		
		for (char character : text.toCharArray()) {
			// Se capitalize está acionado e é um caractere alfabético.
			if (capitalize && Character.isAlphabetic(character)) {
				capitalizedText.append(Character.toUpperCase(character));
				capitalize = false;
				} 
			else {
				capitalizedText.append(character);
			}
			
			// capitalize aciona quando há alguns desses pontos.
			if (character == '.' || character == '?' || character == '!') {
                capitalize = true;
            }
		}
		System.out.println(capitalizedText);
	}
	
	// Desafio 5
	@Override
	public void isAnagramOfPalindrome(String text) {
		Map<Character, Integer> charCount = new HashMap<>();
		
		for (char letter : text.toLowerCase().toCharArray()) {
			// Conta quantas repetições do caractere tem em charCount. Caso já exista, acrescenta mais 1. Caso não exista, inicia com 1.
			if (Character.isAlphabetic(letter)) {
				charCount.put(letter, charCount.getOrDefault(letter, 0) + 1);
			}
		}
		
		// Conta quantas repetições ímpares de caractere ocorrem no texto. Caso ocorra mais de uma vez, não é possível ser um palíndromo.
		int countOddRepetitions = 0;
		for (int numberOfCharacters : charCount.values()) {
			if (numberOfCharacters % 2 == 1) {
				countOddRepetitions++;
			}
		}
		System.out.println(countOddRepetitions <= 1);
	}
}
