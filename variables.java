package zodiaco;

import java.util.Scanner;

public class zodiaco {
	public static void main(String args[]) {
		int a, b, edad, nocontrol;
		String nombre, apellido;

		System.out.println("Dame tu nombre: ");
		Scanner name = new Scanner(System.in);
		nombre = name.nextLine();
		System.out.println("Cual es tu edad: ");
		Scanner years = new Scanner(System.in);
		edad = years.nextInt();
		System.out.println("Cual es el numero de control: ");
		Scanner control = new Scanner(System.in);
		nocontrol = control.nextInt();

		System.out.println("Ingrese el día y el mes de su nacimiento");
		System.out.print("Dia = ");
		Scanner dia = new Scanner(System.in);
		a = dia.nextInt();
		System.out.print("Mes = ");
		Scanner mes = new Scanner(System.in);
		b = mes.nextInt();