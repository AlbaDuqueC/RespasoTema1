package Parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		double a, b, precio , result;
		
		final double ENTRADA_NIÑOS=15.50;
		final double ENTRADAS_ADULTOS= 20;
		final double DESCUENTO= 0.05;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca cuantas entradas infantiles quieres:");
		
		a= sc.nextInt();
		
		System.out.println("Introduzca cuantas entradas adultas quieres:");
		
		b= sc.nextInt();
		
		precio= (double) (a*ENTRADA_NIÑOS) + (b+ENTRADAS_ADULTOS);
		
		result= precio>=100 ? precio - precio*DESCUENTO : precio;
		
		System.out.println(result + " euros");
		
		sc.close();
		
		
		
		

	}

}
