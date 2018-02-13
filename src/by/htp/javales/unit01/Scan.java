package by.htp.javales.unit01;

import java.util.Scanner;

public class Scan {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i;
		Scanner conIn = new Scanner (System.in);
		System.out.println("¬ведите число: ");
		while (conIn.hasNext()) {
			i = conIn.nextInt();
			System.out.println("i="+i);
		}
	}

}
