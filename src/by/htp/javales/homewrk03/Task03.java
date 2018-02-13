package by.htp.javales.homewrk03;

import java.util.Random;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		int[][] mtrx = createMatrix();
		int[][] mtrx2 = createMatrix();
		
		printMatrix(mtrx);
		printMatrix(mtrx2);
		
		multiElemOfMtrx(mtrx);
		sumElemOfMtrx(mtrx);
		System.out.println("������������ ���� ������ :");
		printMatrix(multiElemOf2Mtrx(mtrx,mtrx2));
		System.out.println("����� ���� ������ :");
		printMatrix(sumElemOf2Mtrx(mtrx,mtrx2));
	}

	public static int[][] createMatrix() {

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int n = 0;

		System.out.println("������� ������ ������� NxN: ");

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n == 0) {
					System.out.println("������ ������� ������ ���� > 0.");
				} else {
					break;
				}
			} else {
				System.out.println("������� ����� �������� N: ");
				sc.next();
			}
		}

		int[][] newMtx = new int[n][n];

		for (int i = 0; i < newMtx.length; i++) {
			for (int j = 0; j < newMtx[i].length; j++) {
				newMtx[i][j] = (rand.nextInt(3) + 1);
			}
		}

		return newMtx;
	}

	public static void printMatrix(int[][] mtx) {
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {

				System.out.printf("%5d",mtx[i][j]);
			}
			System.out.println("");
		}
		System.out.println("---------------------------------------------");
	}

	public static void multiElemOfMtrx(int[][] mtrx) { // ������������ ��������� �������
		long multi = 1;

		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx[i].length; j++) {
				multi =(long)(multi * mtrx[i][j]);
			}
		}
		System.out.println("������������ ��������� ������� ����� : " + multi);
	}

	public static void sumElemOfMtrx(int[][] mtrx) { // ����� ��������� �������
		int sum = 0;

		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx[i].length; j++) {
				sum = sum + mtrx[i][j];
			}
		}
		System.out.println("����� ��������� ������� ����� : " + sum);
	}
	
	public static int[][] sumElemOf2Mtrx(int[][] mtrx, int[][] mtrx2) { //����� ���� ������
		
		int [][] sum2Mtrx = new int[mtrx.length][mtrx2[0].length];
		
		for(int i = 0; i< mtrx.length; i++) {
			for(int j = 0; j< mtrx2[i].length; j++) {
				sum2Mtrx[i][j] = mtrx[i][j]+mtrx2[i][j];
			}
				
		}
		return sum2Mtrx;
		
	}
	public static int[][] multiElemOf2Mtrx(int[][] mtrx, int[][] mtrx2) {  // ������������ ���� ������
		
		int [][] multi2Mtrx = new int[mtrx.length][mtrx2[0].length];
		
		for(int i =0; i<mtrx.length; i++) {
			for(int j =0; j<mtrx2[i].length; j++) {
				for(int k = 0; k<mtrx2.length; k++)
				multi2Mtrx[i][j] += mtrx[i][k]*mtrx2[k][j];
			}
			
		}
		return multi2Mtrx;
		
	}

}



