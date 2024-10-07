package Parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Valores
		double metros;
		int cm;
		
		//Constantes
		final int CONVERSION= 100;
		
		//Scanner
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca la medida en metros: ");
		
		metros= sc.nextDouble();
		
		cm= (int) (metros*CONVERSION);
		
		System.out.println(cm);
		
		//Cierre del Scanner
		sc.close();

	}

}
