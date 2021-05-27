package scl.edu.gt;

import java.util.Scanner;

public class arithmeticFunctions {
	
	
	public static void sumar(){
	
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("num2: ");
		double num2 = numeral2.nextDouble();
		
		double respuesta = num1 + num2;
		
		System.out.println("La suma de "+ num1 + " y "+ num2 + " es: " + respuesta);
		
		
	}
	public static void restar(){
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("num2: ");
		double num2 = numeral2.nextDouble();
		
		double respuesta = num1 - num2;
		
		System.out.println("La resta de "+ num1 + " y "+ num2 + " es: " + respuesta);
		
		
	}
public static void multiplicar(){
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.print("num2: ");
		double num2 = numeral2.nextDouble();
		
		double respuesta = num1 * num2;
		
		System.out.println("La multiplicación de "+ num1 + " y "+ num2 + " es: " + respuesta);
}
public static void dividir(){
	
	Scanner numeral1 = new Scanner(System.in);
	System.out.print("num1: ");
	double num1 = numeral1.nextDouble();
	
	Scanner numeral2 = new Scanner(System.in);
	System.out.print("num2: ");
	double num2 = numeral2.nextDouble();
	
	double respuesta = num1 / num2;
	
	System.out.println("La división de "+ num1 + " y "+ num2 + " es: " + respuesta);
}
public static void residuo(){
	
	Scanner numeral1 = new Scanner(System.in);
	System.out.print("num1: ");
	double num1 = numeral1.nextDouble();
	
	Scanner numeral2 = new Scanner(System.in);
	System.out.print("num2: ");
	double num2 = numeral2.nextDouble();
	
	double respuesta = num1 / num2;
	
	System.out.println("La división de "+ num1 + " y "+ num2 + " es: " + respuesta);

}

	
}

