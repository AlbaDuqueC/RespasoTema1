package Parte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variabales 
		double num;
		
		//creamos scanner
		Scanner sc= new Scanner(System.in) ;
		
		//Pide un numero
		System.out.println("Inserta un numero");
		
		//Introduce un numero
		num= sc.nextDouble();
		
		//Imprime el numero insertado
		System.out.println(num);
		
		//cierre del scanner
		sc.close();

	}

}
