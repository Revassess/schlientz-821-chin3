package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int sum = 0;
		if (arr.length == 0)
				return 0;
		else {
			for(int n : arr) {
				sum +=n;
			}
			return sum;
		}
	}
	public static void main(String args[]) {
		int[] arr = {};
		System.out.println(IterateAndSum(arr));
	}
}
