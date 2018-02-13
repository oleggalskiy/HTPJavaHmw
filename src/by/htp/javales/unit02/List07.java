package by.htp.javales.unit02;

public class List07 {

	public static void main(String[] args) {
		int size = 10;
		double[] arMy = new double[size];
		int i;

		for (i = 0; i < arMy.length; i++) {
			arMy[i] = Math.random();
		}	
		for (double x: arMy) {
			System.out.print(x+ " ");
		}

	}

}
