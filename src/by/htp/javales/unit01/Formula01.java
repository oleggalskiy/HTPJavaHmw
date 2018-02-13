package by.htp.javales.unit01;

public class Formula01 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double rez;
		
	a= 4;
	b= 6;
	c= 88;
	rez = (b+Math.sqrt(b*b+4*a*c)/2*a)-Math.pow(a,3)*c+b;
	System.out.println("Результат = "+ rez);

	}

}
