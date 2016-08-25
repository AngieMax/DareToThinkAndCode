package com.array.codes;

import java.util.Arrays;

/*
 * Example of how you can reverse an array of String in Java in place. 
 * This program doesn't use a temporary buffer or another array, instead, it just loop over 
 * array and swap elements e.g. starting from the first element, it swap the first to last, 
 * second to the second last, until it reaches the middle of the array. 

 Time complexity is O(n/2) or O(n) 
 because it needs to iterate over almost half the elements and perform n/2 swapping as well. 
 The space complexity of the algorithm is O(1) because no matter how big the array is, it requires same space

 This is also the fastest way to reverse an array in Java.
 It cannot be faster than this because we are only accessing array which is constant time operation. 
 The only thing you can optimize is to minimize swapping.

 */

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("Reverse without buffer");
		int[] arr = { 11, 22, 33, 44, 55, 66 };
		System.out.println("Original Arr1 : " + Arrays.toString(arr));
		reverse(arr);
		System.out.println("Reversed :" + Arrays.toString(arr));

		String[] arr1 = { "aaa", "ddd", "vvvv", "rrrr" };
		System.out.println("Original String Array" + Arrays.toString(arr1));
		reverse(arr1);
		System.out.println("Reversed :" + Arrays.toString(arr1));
		
		String[] test = { "John" };
		System.out.println("original array: " + Arrays.toString(test));
		// testing reverse array function with array of just one element
		reverse(test);
		System.out.println("reversed array: " + Arrays.toString(test));

	}

	public static void reverse(int[] arr) {
		// Case1 : array is null //Case2: array size is 1
		if (arr == null || arr.length < 2) {
			return;
		}

		// Case3: array size is >2
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

	}

	/** * Java Method to reverse String array in place * * @param array */
	public static void reverse(String[] array) {
		if (array == null || array.length < 2) {
			return;
		}
		for (int i = 0; i < array.length / 2; i++) {
			String temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}

}
