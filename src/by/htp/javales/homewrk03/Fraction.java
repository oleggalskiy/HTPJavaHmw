package by.htp.javales.homewrk03;

public class Fraction {

	private int numerator;

	private int denominator;

	public Fraction() {
		numerator = 0;
		denominator = 1;

	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;

	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	
	public Fraction add(Fraction obj) { // сложение дробей
		
		int newNumerator = numerator*obj.denominator+obj.numerator
				* denominator;
		int newDenominator = denominator*obj.denominator;
		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		return newFraction;
		
	}
	public void sokr() { // Сокращение дроби

		int nod;
		if (numerator > denominator) {
			nod = numerator;
		} else {
			nod = denominator;
		}

		while (!((numerator % nod == 0) && (denominator % nod == 0))) {
			nod--;
		}
		
		numerator = numerator / nod;
		denominator = denominator / nod;
		
	}
	
	public Fraction sub(Fraction obj) { // вычитание дробей
		int newNumerator = numerator*obj.denominator- obj.numerator*denominator;
		int newDenominator = denominator*obj.denominator;		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		return newFraction;
		
	}
	
	public Fraction multi(Fraction obj) { // умножение дробей
		int newNumerator = numerator* obj.numerator;
		int newDenominator = denominator * obj.denominator;
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		return newFraction;
	}
	
	public Fraction div(Fraction obj) { // деление дробей
		int newNumerator = numerator* obj.denominator;
		int newDenominator = denominator * obj.numerator;
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		return newFraction;
	}

	@Override
	public String toString() {
		return "Fraction [" + numerator + "/" + denominator + "]";
	}
	
}
