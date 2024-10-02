package Parte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variables
		int edad;
		
		//crear el scanner
		Scanner sc= new Scanner(System.in);
		
		//Te pide tu edad 
		System.out.println("Introduzca su edad");
		
		//Introduce tu edad
		edad= sc.nextInt();
		
		//Te da la edad que vas a cumplir
		System.out.println("Vas a cumplir " + (edad + 1));
		
		//cierre del scanner
		sc.close();

	}

}
