package Parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Valores
		int a , b , c , x , y;
		
		//Crear scanner
		Scanner sc= new Scanner(System.in);
		
		//Pide que introduzcas los valores de a, b, c, y x
		System.out.println("Introduzca los valores de a, b, c y x:");
		
		//Introduce los valores de a, b, c y x
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		x= sc.nextInt();
		
		//Calcular el valor de y mediante el polinomio de segundo grado y=ax2+bx+c
		y = ((a*x)*(a*x)) + (b*x)+c ;
		
		//Imprime por pantalla el valor de y
		System.out.println("El valor de y es: "+ y);
		
		//cierre del scanner
		sc.close();
	
		
	}

}
