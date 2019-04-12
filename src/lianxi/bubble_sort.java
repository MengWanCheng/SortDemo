package lianxi;

public class bubble_sort {

	public static void main(String[] args) {
		int arr[] = new int[] {45, 24, 32, 4, 21, 42 , 33};
		sort(arr);
	}
	public static void sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++ ) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
