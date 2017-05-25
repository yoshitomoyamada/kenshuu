package src.main.java;

public class Question2 {

	/**
	 * mainメソッドです。
	 * ここから処理を実行します。
	 */
	public static void main(String[] args) {
		// ソート対象となる配列です。
		int[] arr = { 5, 4, 2, 3, 8, 7, 1, 0, 6, 9 };

		// ソート前の値をコンソールに出力します。
		System.out.print("ソート前：");
		arrayPrintln(arr);

		// ソートを実行します。
		quickSort(arr, 0, arr.length - 1);

		// ソート後の値をコンソールに出力します。
		System.out.print("ソート後：");
		arrayPrintln(arr);
	}

	/**
	 * クイックソートを行うメソッドです。
	 * ここに実装してください。
	 */

	public static void quickSort(int[] arr, int left, int right) {
		int A;
		int B;
		if (left == right)
			return;
		A = check(arr, left, right);
		if (A != -1) {
			B = chenge(arr, left, right, arr[A]);
			quickSort(arr, left, B - 1);
			quickSort(arr, B, right);
		}
	}

	static int check(int[] arr, int x, int y) {
		int C = x + 1;
		while (C <= y && arr[x] == arr[C])
			C++;
		if (C > y)
			return -1;
		if (arr[x] >= arr[C])
			return x;
		return C;
	}

	static int chenge(int[] arr, int x, int y, int N) {
		int left = x;
		int right = y;
		int W;

		while (left <= right) {
			while (left <= y && arr[left] < N)
				left++;
			while (right >= x && arr[right] >= N)
				right--;

			if (left > right)
				break;

			W = arr[left];
			arr[left] = arr[right];
			arr[right] = W;

			left++;
			right--;
		}
		return left;
	}

	/**
	 * 配列の値を順に出力するメソッドです。
	 * 
	 * @param arr 出力対象の配列。
	 * @return 計算結果を配列で返します。
	 */
	public static void arrayPrintln(int[] arr) {

		// 配列の値を順に取り出し、コンソールに出力します。
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("");
	}

}
//test