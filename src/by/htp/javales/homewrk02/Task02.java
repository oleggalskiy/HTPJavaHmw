package by.htp.javales.homewrk02;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		double[] arr = initArr();

		findMaxElementAndIndex(arr);
		findMinElementAndIndex(arr);
		printArr(arr);
		sortArray(arr);

	}

	public static void sortArray(double[] arr) {

		int min;
		double tmp;

		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
				tmp = arr[i];
				arr[i] = arr[min];
				arr[min] = tmp;
			}
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.print("���� ����� ���������� :");

		for (int i = 0; i < arr.length; i++) {
			System.out.print("-> [" + arr[i] + "] ");
		}

	}

	public static void findMinElementAndIndex(double[] arr) {
		double min;
		int index;

		min = arr[0];
		index = 0;

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}

		System.out.println("����������� ������� -> " + min + " ���������� �� ������� -> " + index + " .");

	}

	public static void findMaxElementAndIndex(double[] arr) {
		double max;
		int index;

		max = arr[0];
		index = 0;

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("������������ ������� -> " + max + " ���������� �� ������� -> " + index + " .");
		System.out.println("------------------------------------------------------------------------------");
	}

	public static double[] initArr() {
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

		double[] arr = new double[n];

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

	public static void printArr(double[] arr) {

		System.out.println("-----------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("-> [" + arr[i] + "]");
		}
		System.out.println("");
	}
}
