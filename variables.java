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

		if (a >= 22 && b == 12) {
			System.out.println("Su signo es capricornio" + "\n tu edad es: " + edad + "\n tu nombre es: " + nombre
					+ "\n tu No. control: " + "\n dia: " + a + "\n mes: " + b);
		}
		if (a < 20 && b == 1) {
			System.out.println("Su signo es capricornio");
		}
		if (a >= 21 && b == 1) {
			System.out.println("Su signo es acuario");
		}
		if (a <= 20 && b == 2) {
			System.out.println("Su signo es acuario");
		}
		if (a >= 21 && b == 2) {
			System.out.println("Su signo es piscis");
		}
		if (a <= 20 && b == 3) {
			System.out.println("Su signo es piscis");
		}
		if (a >= 21 && b == 3) {
			System.out.println("Su signo es aries");
		}
		if (a <= 19 && b == 4) {
			System.out.println("Su signo es aries");
		}
		if (a >= 20 && b == 4) {
			System.out.println("Su signo es tauro");
		}
		if (a <= 20 && b == 5) {
			System.out.println("Su signo es tauro");
		}
		if (a >= 21 && b == 5) {
			System.out.println("Su signo es geminis");
		}
		if (a <= 21 && b == 6) {
			System.out.println("Su signo es geminis");
		}
		if (a >= 22 && b == 6) {
			System.out.println("Su signo es cancer");
		}
		if (a <= 21 && b == 7) {
			System.out.println("Su signo es cancer");
		}
		if (a >= 22 && b == 7) {
			System.out.println("Su signo es leo");
		}
		if (a <= 21 && b == 8) {
			System.out.println("Su signo es leo");
		}
		if (a >= 22 && b == 8) {
			System.out.println("Su signo es Virgo");
		}
		if (a <= 22 && b == 9) {
			System.out.println("Su signo es Virgo");
		}
		if (a >= 23 && b == 9) {
			System.out.println("Su signo es Libra");
		}
		if (a <= 21 && b == 10) {
			System.out.println("Su signo es Libra");
		}
		if (a >= 22 && b == 10) {
			System.out.println("Su signo es Escorpio" + "\n tu edad es: " + edad + "\n tu nombre es: " + nombre
					+ "\n tu No. control: " + "/n dia: " + a + "/n mes: " + b);
		}
		if (a <= 21 && b == 11) {
			System.out.println("Su signo es Escorpio" + "\n tu edad es: " + edad + "\n tu nombre es: " + nombre
					+ "\n tu No. control: " + "/n dia: " + a + "/n mes: " + b);
		}
		if (a >= 22 && b == 11) {
			System.out.println("Su signo es Sagitario");
		}
		if (a <= 21 && b == 12) {
			System.out.println("Su signo es Sagitario");
		}