package appArrayTabla;

import java.util.Random;

public class MainTabla {
	
//	//TODO: HACED LOS SIGUIENTES MÉTODOS:
//
//	1) Haced un método que reciba un array de números 2 dimensiones y devuelva la suma de todas
//	las posiciones
//
//	2) Haced un método que reciba un array de números y lo muestre de la siguiente manera:
//
//			Pe ej, siendo el array de 3 x 3
//
//			1 2 3
//			4 5 6
//			7 8 9
//
//			PISTA: si hago sysout print no me mete salto de línea
//	      si hago sysout println sí me mete un salto de línea
//
//	3) Haced un método que reciba las dimensiones de un array (número de filas y columnas)
//	y devuelva un array relleno de números aletorios entre 1 y 100
//
//
//	4) Haced un método que reciba un array de números y lo muestre como en el punto 2, pero además,
//	incluya la suma de las filas
//
//	1 2 3 --> 6
//	4 5 6 --> 15
//	7 8 9 --> 24
//
//
//	5) Haced un método que reciba un array de números y lo muestre como en el punto 2, pero además,
//	incluya la suma de las filas y columnas
//
//	1   2   3 --> 6
//	4   5   6 --> 15
//	7   8   9 --> 24
//
//	12  15  18
//
//	*****
	
	public static void main(String[] args) {

		// rellenar la columna 1 con todo unos
		int[][] arrayNum = { { 0, 1, 2 }, { 2, 3, 1 }, { 5, 5, 5 } };
		int[][] array = rellenarArray(5, 5);

		System.out.println(sumaTotalArray(array));
		imprimirArray(array);
		imprimirArrayConSumaDeColumnas(array);
	}

	public static int sumaTotalArray(int[][] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
			}
		}
		return sum;
	}

	public static void imprimirArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == array[i].length - 1) {
					System.out.println(array[i][j]);
				} else {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}

	public static int[][] rellenarArray(int x, int y) {
		int[][] array = new int[x][y];
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = r.nextInt(101);
			}
		}
		return array;
	}

	public static void imprimirArrayConSuma(int[][] array) {

		int sumaFila = 0;

		for (int i = 0; i < array.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (j == array[i].length - 1) {
					sumaFila = sumaFila + array[i][j];
					System.out.println(array[i][j] + " --> " + sumaFila);
				} else {
					System.out.print(array[i][j] + "  ");
					sumaFila = sumaFila + array[i][j];
				}
			}
		}
	}

	public static void imprimirArrayConSumaDeColumnas(int[][] array) {

		int sumaFila = 0;
		int sumaColumna = 0;

		for (int i = 0; i < array.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (j == array[i].length - 1) {
					sumaFila = sumaFila + array[i][j];
					System.out.println(array[i][j] + " --> " + sumaFila);
				} else {
					System.out.print(array[i][j] + "  ");
					sumaFila = sumaFila + array[i][j];
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			sumaColumna = 0;
			for (int j = 0; j < array[i].length; j++) {
				sumaColumna = sumaColumna + array[j][i];
			}
			System.out.print(sumaColumna + "  ");
		}
	}
}