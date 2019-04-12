package lianxi;

public class SelectSort {

	public static void main(String[] args) {
		int arr[] = new int[] {2, 12, 78 ,45, 45, 8, 46,-1};
		select(arr);
		for(int i: arr) {
			System.out.println(i);
		};
	}
	public static void select(int[] a) {
		int temp;
		int minIndex;
		for(int i=0; i<a.length; i++) {
			//取出最小元素的下标
			minIndex = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[minIndex]>a[j]) {
					minIndex = j;
				}
			}
			//把最小元素放于首端
			temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
}
