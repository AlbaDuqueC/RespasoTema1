package Parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Valores
		double num;
		int numEntero;
		
		//crear scanner
		Scanner sc= new Scanner(System.in);
		
		//pide un numero con decimales
		System.out.println("Introduzca un valor con decimales:");
		
		//Escanea el valor
		num= sc.nextDouble();
		
		//Calculamos el valor entero
		numEntero= (int) (num+0.5);
		
		//muestra el valor por pantalla
		System.out.println("El numero entero redondeado es: " + numEntero);
		
		//Cierre del scanner
		sc.close();

	}

}
