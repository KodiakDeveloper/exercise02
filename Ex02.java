package basicAlgorithms;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// Circle Area

		Double area, radius;

		final Double pi = Math.PI;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input Radius : ");

		radius = scan.nextDouble();

		scan.close();

		area = pi * (radius * radius);

		System.out.println("Area = " + area + " m²");

	}

}
