package by.htp.javales.unit01;

import java.util.Scanner;

public class Formula02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double z;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¬ведите x:");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		System.out.print("¬ведите y:");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
			}
		double temp;
		temp = Math.cos(x)-x/3;
		if (temp != 0) {
			z = Math.log(x) + y/temp;
		}else {
			System.out.println("«наменатель равен нулю");
			z = Double.NaN;
		}
		System.out.println("z="+z);
	}

}
