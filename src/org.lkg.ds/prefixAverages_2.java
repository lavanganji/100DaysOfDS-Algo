 package org.lkg.ds;
 
 // Problem : Given an input of n-element array A of Numbers;
 // We need find the output : an n-element array S of Numbers such that S[i] is 
 // the average of elements A[0] .... A[i];

public class prefixAverages_2 {

	public static void main(String[] args) {
		long startTime = 0 , endTime =0, totalTime =0;
		int arr[] = { 3,4,2,1};  // 3 3 3 2
		
		// Brute Foce
		startTime = System.nanoTime();
		int[] r =bruteForcePrefixAverage(arr);
		diplay(r);
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("\nRun time of Brute Force\t"+totalTime);

		startTime = System.nanoTime();
		int[] r1 =efficientPrefixAverage(arr);
		diplay(r1);
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("\nRun time of Efficient Algorithm\t"+totalTime);

	}

	private static void diplay(int[] r) {
		for(int a: r) {
			System.out.print(a+"\t");
		}
		
	}

	private static int[] efficientPrefixAverage(int[] arr) {
		int[] result = new int[arr.length];
		int avg = 0;
		for(int i=0;i<arr.length;i++) {
			avg = avg + arr[i];
			result[i] = avg/(i+1);
		}
		return result;
	}

	private static int[] bruteForcePrefixAverage(int[] arr) {
		int[] result = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int avg = 0;
			for(int j=0;j<=i;j++) {
				avg = avg + arr[j];
				result[i] = avg/(i+1);
			}
		}
		return result;
		
	}

}
