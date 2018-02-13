package by.htp.javales.unit02;

public class List01 {
	public static void m1() {
		System.out.println("AAA");
	}
	public static void m2(int x) {
		System.out.println("x = "+x);
	}
	public static int m3( ) {
		int z = 89;
		return z;
	}
	public static int m4(int k) {
		k = k+1;
		return k;
	}

	public static void main(String[] args) {
		m1();
		m2(23);
		System.out.println(m3());
		System.out.println(m4(56));

	}

}
