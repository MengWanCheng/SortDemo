package lianxi;

public class binarySearch {
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
		int index = binary(arr,8);
		System.out.println(index);
	}
	public static int binary(int[] arr, int item) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int middle = (low+high)/2;
			if(item == arr[middle]) {
				return middle;
			}
			if(item<arr[middle]) {
				high = middle-1;
			}
			if(item>arr[middle]) {
				low = middle+1;
			}
		}
		return -1;
	}
}
