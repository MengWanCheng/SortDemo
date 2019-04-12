package lianxi;

public class InsertSort {

	public static void main(String[] args) {
		int arr[] = new int[] {45,132,4234,12,312,32,123};
		insert(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
	public static void insert(int[] a) {
		
		for(int i=1; i<a.length; i++) {
			int temp = a[i];//摸下一张牌，待插入的数
			for(int j=i; j>0; j--) {
				if(temp<a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}
}
