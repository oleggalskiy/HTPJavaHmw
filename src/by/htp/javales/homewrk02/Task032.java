package by.htp.javales.homewrk02;

import java.util.Scanner;

public class Task032 {

	public static void main(String[] args) {
		int[] arr = initArr();
		int[] newArr = creatArrNull(arr);
		
		printArr(arr);
		
		System.out.println("");
		System.out.print("������� ������� ��������� �������:");
		System.out.println("");
		printArr(newArr);
	}

	public static void printArr(int[] arr) {

		System.out.println("-----------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("-> [" + arr[i] + "]");
		}
		System.out.println("");
	}

	public static int[] creatArrNull(int[] arr) {

		int lengthNewArr = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				lengthNewArr++;
			}
		}
		int[] newArr = new int[lengthNewArr];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				newArr[j] = i;
				j++;
			}
		}

		return newArr;
	}

	public static int[] initArr() {
		int n = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ���������� ��������� �������:");

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n > 0) {
					break;
				} else {
					System.out.println("�������� ������ ���� > 0 ");
				}
			} else {
				System.out.println("�� �� ����� ������������� ��������. ���������� ��� ���.");
				sc.next();
			}
		}

		int[] arr = new int[n];

		System.out.println("������� �������� ��������� �������:");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("������� �������� �������� [" + i + "] �������:");

			while (sc.hasNext()) {
				if (sc.hasNextInt()) {
					arr[i] = sc.nextInt();
					break;
				} else {
					System.out.println("������� ����� �����.");
					sc.next();
				}
			}
		}
		return arr;
	}
}
