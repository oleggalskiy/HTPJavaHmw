package by.htp.javales.homewrk02;

import java.util.Scanner;

public class Task034 {

	public static void main(String[] args) {
		double[] arr = enterArr();
		printArray(arr);

		System.out.println("������ ������ �����:");
		
		printArray(createArrEvenNumbers(arr));
		
		
	}

	public static double [] createArrEvenNumbers(double[] arr){
		int countNewArr = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0)
			countNewArr++;
		}
		
		double[] newArr = new double[countNewArr];
		int j= 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				newArr[j] = arr[i];
				j++;
				
			}
		}			
		return newArr;
	}
	
	public static double[] enterArr() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.println("������� ����������� ��������� �������: ");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				count = sc.nextInt();
				if (count <= 0) {
					System.out.println("����� ������ ���� > 0 ");
				} else {
					break;
				}
			} else {
				System.out.println("������� ����� �����! ");
				sc.next();
			}
		}
	
		double[] arr = new double[count];

		System.out.println("������� �������� ��������� �������:");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("������� �������� �������� [" + i + "] �������:");

			while (sc.hasNext()) {
				if (sc.hasNextDouble()) {
					arr[i] = sc.nextDouble();
					break;
				} else {
					System.out.println("������� ������������ �����.");
					sc.next();
				}
			}
		}

		return arr;
	}

	public static void printArray(double[] arr) {
		if (arr.length == 0) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("� ������� ����������� ��������.");
		} else {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("->[" + arr[i] + "] ");
			}
		}
		System.out.println("");
	}
	
}
