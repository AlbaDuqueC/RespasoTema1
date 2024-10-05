package Parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Valores
		int a;
		int b;
		int resto;
		int resultado;
		
		//crear scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide un numero
		System.out.println("Introduzca un numero entero:");
		
		//scanea el valor introducido
		a= sc.nextInt();
		
		/*calculamos el balor de b que tiene que se la suma de 
		 * a que su resultado sea multiplo de 7*/
		
		resto=a%7;
		b=7-resto;
		resultado= b==7 ? 0:b;
		
		//Imprime por pantalla el resultado 
		System.out.println("se necesita sumarle "+ resultado + " a " + a + " para que sea multiplo de 7");
		
		//cierre del scanner
		sc.close();

	}

}
