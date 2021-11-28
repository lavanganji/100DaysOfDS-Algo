package org.lkg.ds;

import java.util.Arrays;

public class InsertionSort_1 {

	public static void main(String[] args) {
		int[] arr = {3,6,4,8,9,7,2,5,1};
		System.out.println("Before SORT : "+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After  SORT : "+Arrays.toString(arr));
		insertionSortDesc(arr);
		System.out.println("After  SORT : "+Arrays.toString(arr));
	}

	private static void insertionSortDesc(int[] arr) {
		// TODO Auto-generated method stub
		for (int j=1 ; j<arr.length;j++) {
			int key = arr[j];
			int i = j-1;
			while(i>=0 && arr[i]<key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int j=1 ; j<arr.length;j++) {
			int key = arr[j];
			int i = j-1;
			while(i>=0 && arr[i]>key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
	}

}