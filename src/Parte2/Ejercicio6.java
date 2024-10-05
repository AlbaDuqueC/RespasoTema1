package Parte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Valores
		double mm , cm , m , result;
		
		final double CONVERTIR1= 10 ;
		final double CONVERTIR2= 100 ;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca las medidas, primera en milimetros, la segunda en centimetros y la tercera en metros:");
		
		mm= sc.nextDouble();
		cm= sc.nextDouble();
		m= sc.nextDouble();
		
		//Calculos
		result= (mm/CONVERTIR1) + cm + (m*CONVERTIR2);
		
		System.out.println(result + " cm");
		
		sc.close();
		
		

	}

}
