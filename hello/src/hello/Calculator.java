package hello;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		System.out.println("Podaj liczbe1:");
		Scanner scanner = new Scanner(System.in);
		int liczba1 = scanner.nextInt();
		System.out.println("Podaj liczbe2:");
		int liczba2 = scanner.nextInt();
		System.out.println("Operator dzialania");
		String operacja = scanner.next();
		int wynik = 0;
		if (operacja.equals("*")) {
			wynik = liczba1 * liczba2;}
			else if 
			(operacja.equals("+")) {
				wynik = liczba1 + liczba2; }
				else if 
				(operacja.equals("-")) {
					wynik = liczba1 - liczba2; }
					else if
						(operacja.equals("/")) 
						wynik = liczba1 / liczba2; 
		
			System.out.print(wynik);
			
		}
	}