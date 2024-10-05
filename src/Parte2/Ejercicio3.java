package Parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Valores
		int a;
		int b;
		int c;
		int resto;
		int resultado;
				
		//crear scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide dos numeros
		System.out.println("Introduzca dos numeros enteros:");
		
		//scanea el valor introducido
		a= sc.nextInt();
		b= sc.nextInt();
		
		/*calculamos el balor de c que tiene que se la suma de 
		 * a que su resultado sea multiplo de b*/
		
		resto=a%b;
		c=b-resto;
		resultado= c==a ? 0:c;
		
		//Imprime por pantalla el resultado 
		System.out.println("se necesita sumarle "+ resultado + " a " + a + " para que sea multiplo de " + b);
		
		//cierre del scanner
		sc.close();

	}

}
