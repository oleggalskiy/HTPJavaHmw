package by.htp.javales.unit02;
import java.util.Scanner;
public class List04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		
		System.out.print("¬ведите x: ");
		x = sc.nextDouble();
		
		calcY(x);
		
		System.out.println("¬ведите y: ");
		x = sc.nextDouble();
		
		calcY(x);
	}

	public static void calcY(double x) {
		double fx;
		if (x >=3) {
			fx = -x*x+3*x+9;
		}else {
			fx = 1/ (Math.pow(x, 3)-6);
		}
		
		System.out.println("x = "+x +"  y = "+fx);
		
	}
}
