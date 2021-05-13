//Write a generic method to exchange the positions of two different elements in an array.

import java.util.Arrays;

public class ExchangeArrayPosition {

	public static void main(String[] args) {
		String[] arr1 = {"ab","cd","ef","ghi","jk","lmn"};
		System.out.println(Arrays.toString(arr1));
		swap(arr1,1,4);
		System.out.println(Arrays.toString(arr1));
		
		Integer[] arr2 = {85,60,96,9,82,65};
		System.out.println(Arrays.toString(arr2));
		swap(arr2,3,5);
		System.out.println(Arrays.toString(arr2));
	}
	public static<T> void swap(T[] arr, int a, int b) {
		T temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}


}
