package co.park.sort;

public class Sort {
	private int[] arr;

	public int[] selectionSort(int[] num, int n) { // 내림차순 소팅
		int min, temp;
		arr = num;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i; // i의 요소값리 가장 작다고 전재
			for (int j = i + 1; j < arr.length; j++) {
				if (n == 0) {
					if (arr[min] > arr[j]) // n=0 이면 오름차순
						min = j;
				} else {
					if (arr[min] < arr[j]) // n=0 아니면 내림차순
						min = j;
				}
			}
			if (min != i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}

	public int[] bubbleSort(int[] num) { // 버블 소트
		int temp = 0;
		arr = num;

		for (int m = 0; m < arr.length; m++) {

			for (int i = 0; i < arr.length-1-m; i++) { //처음에는 끝자리는 비교 필요 없슴, 뒤로정렬될수록 비교안해도 됨
				int j = i + 1;

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			for(int q=0;q<arr.length;q++) {
			System.out.print(":"+arr[q]);
			}
			System.out.println("");
			}

		}
		for (int p = 0; p < arr.length; p++) {
			System.out.print("["+arr[p]+"]");
		}
		return arr;
	}

	public int[] quickSort(int[] num) { // 퀵소트

		return arr;
	}
}
