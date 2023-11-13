package codewarsFindMissingLetter;

public class Main {
	static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/*
	 * 
	 * ['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'
	 */

	static char test[] = { 'a', 'b', 'd', 'e'};
	static char test1[] = { 'O', 'Q', 'R', 'S' };

	public static String toString(char[] a) {
		// Creating object of String class
		String string = new String(a);

		return string;
	}

	public static char encontrarFalta(char[] secuencia) {
		char caracterFalta = ' ';
		int i = 0;
		boolean letraEncontrada = false;
		int numchar = secuencia[i];
		
		while (!letraEncontrada) {
			if (numchar != secuencia[i]) {
				letraEncontrada = true;
				numchar = secuencia[i] - 1;
			} else {
				i++;
				numchar++;
			}
			
		}

		caracterFalta = (char) numchar;

		return caracterFalta;
	}

	public static void main(String args[]) {

		char caracterFalta = encontrarFalta(test1);
		System.out.println("Caracter que falta " + caracterFalta);

		/*
		 * String array = toString(test);
		 * 
		 * array = array.toUpperCase();
		 * 
		 * int posAlfabeto = 0; int s = 0; int missingLetter = 0; boolean foundLetter =
		 * false;
		 * 
		 * for (int i = 0; i < ALPHABET.length(); i++) { if(ALPHABET.charAt(i) ==
		 * array.charAt(0)) { posAlfabeto = i; } }
		 * 
		 * while (!foundLetter) {
		 * 
		 * if (ALPHABET.charAt(posAlfabeto) != array.charAt(s)) { missingLetter =
		 * posAlfabeto; foundLetter = true; } posAlfabeto++; s++; }
		 * 
		 * System.out.println(ALPHABET.charAt(missingLetter));
		 */
	}

}