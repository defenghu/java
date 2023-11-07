package parimpar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int numeroLeido = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			    
			System.out.println("Mete un número: ");
			numeroLeido = scanner.nextInt();

			if ((numeroLeido%2)==0)
				System.out.println("Has metido un par.");
			else {
				System.out.println(numeroLeido);
			}
		} while (numeroLeido!=0);
	}
}