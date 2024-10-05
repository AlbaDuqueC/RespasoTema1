package Parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Valores
		int a, seg , min , h;
		
		//crear scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide segundos
		System.out.println("Introduzca una cantidad de segundos: ");
		
		//scanea el valor introducido
		a= sc.nextInt();
		
		//Calcula los valores de minutos, horas y segundos 
		h= a/3600;
		min=(a%3600)/60;
		seg=(a%3600)%60;
		
		//Imprime por pantalla el resultado
		System.out.println("El resultado es: " + h + " h " + min +" min " + seg + " seg");
		
		//Cierre del scanner
		sc.close();

	}

}
