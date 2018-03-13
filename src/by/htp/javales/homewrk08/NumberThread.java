package by.htp.javales.homewrk08;

public class NumberThread implements Runnable {

	private int counter;
	private Matrix matrix;

	public NumberThread() {
		counter = 1;
	}

	public NumberThread(int counter, Matrix matrix) {
		this.counter = counter;
		this.matrix = matrix;

	}

	public int getCounter() {
		return counter;
	}

	@Override
	public void run() {
		doAction();

	}

	public void doAction() {
		synchronized (matrix) {
			
				setNumberInMatrix();
			
		}

	}

	public void setNumberInMatrix() {
		int[][] result = matrix.getMatrix();
		for (int i = 0; i < result.length; i++) {
			if (result[i][i] == 0) {
				result[i][i] = counter;
				System.out.println("Поток № " + counter + " поместил значение в [" + i + "] " + "[" + i + "] ");

				break;
			} else {
				continue;
			}

		}
	}
}
