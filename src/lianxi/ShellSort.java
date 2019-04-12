package lianxi;

public class ShellSort {

	public static void main(String[] args) {
		int arr[] = new int[] {49,38,65,97,76,13,27,49,78,34,12,64,1};
		shell(arr, arr.length);
		for(int i: arr) {
			System.out.println(i);
		}
	}
	public static void shell(int[] a, int N) {
		int temp;
		for(int d=N/2; d>0; d/=2) {
			for(int i=d; i<N; i++) {
				temp = a[i];
				for(int j=i; j>=d; j-=d) {
					if(a[j-d]>temp) {
						temp = a[j];
						a[j] = a[j-d];
						a[j-d] = temp;
					}
				}
			}
		}
	}
}
