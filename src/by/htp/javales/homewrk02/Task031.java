package by.htp.javales.homewrk02;

import java.util.Scanner;

public class Task031 {

	public static void main(String[] args) {
		int k;
		int sum;
		int[] arr = initArr();
		printArr(arr);
		k = initMultiple();
		sum = sumElementsMultiple(k, arr);

		System.out.println("����� �������� ������� [" + k + "] ����� " + sum + " .");

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
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + 1;
		}
		return arr;
	}

	public static void printArr(int[] arr) {

		System.out.println("-----------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("-> [" + arr[i] + "]");
		}
		System.out.println("");
	}

	public static int initMultiple() {
		int k = 0;
		System.out.println("������� �������� K: ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				k = sc.nextInt();
				if (k > 0) {
					break;
				} else {
					System.out.println("�������� � ������ ���� ������ 0.");
				}
			} else {
				System.out.println("������� ����� �����.");
			}
		}
		return k;
	}

	public static int sumElementsMultiple(int k, int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

}
