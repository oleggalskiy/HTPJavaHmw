package by.htp.javales.unit01;
import java.util.Scanner;

public class sqtriangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double a=0;
		double b=0;
		double c=0;
		double P;
		double S;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите a:");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.print("Введите b:");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		c=Math.sqrt(a*a+b*b);
		P=a+b+c;
		S=0.5*a*b;
		
		System.out.println("Периметр = "+ P+"Площадь = "+ S);
				
	}

}
