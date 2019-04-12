package lianxi;

public class QuickSort {

	public static void main(String[] args) {

		int arr[] = new int[] { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		quick(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void quick(int[] a, int low, int high) {
		if(low >= high) {
			return;
		}
		int i = low;
		int j = high;
		// ����һ������
		int key = a[i];

		while (i < j) {
			while (a[j] >= key && i < j) {
				j--;
			}
			if (i < j) {
				int t;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}

			while (a[i] <= key && i < j) {
				i++;
			}
			if (i < j) {
				int t;
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
			// �Ի������ļ����ظ�����
			quick(a, low, i - 1);

			// �Ի����Ҳ�ļ����ظ�����
			quick(a, i + 1, high);
		}
	}
}
