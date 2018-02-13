package by.htp.javales.unit02;

import java.util.Scanner;

public class List09 {

	public static void main(String[] args) {
		double[] ar = new double[10];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar[" + i + "]=>");
			ar[i] = sc.nextDouble();
		}
		System.out.println();
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(">arr["+ i + "]="+ ar[i]);
		}
		
		System.out.println();
		
		for (int i=0; i<ar.length; i++) {
			System.out.println("arr["+ i + "]="+ ar[i] + "; ");
		}
		System.out.println();
	}

}
