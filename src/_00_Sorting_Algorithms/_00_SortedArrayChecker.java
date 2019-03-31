package _00_Sorting_Algorithms;

import java.lang.reflect.Array;

public class _00_SortedArrayChecker {
	
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	
	static boolean intArraySorted(int[] a) {
		boolean returN = true;
		for(int i = 1; i < a.length; i++) {
			 if(a[i-1] > a[i]) {
				returN = false;
				i = a.length;
			}
		}
		return returN;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	
	static boolean doubleArraySorted(double[] a) {
		boolean returN = true;
		for(int i = 1; i < a.length; i++) {
			if(a[i-1] > a[i]) {
				returN = false;
				i = a.length;
			}
		}
			return returN;
	}
			
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	static boolean charArraySorted(char[] a) {
		char j;
		boolean returN = true;
		for(int i = 1; i < a.length; i++) {
			j = a[i-1];
			if(j > a[i]) {
				returN = false;
				i = a.length;
			}
		}
			return returN;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	
	static boolean stringArraySorted(String[] a) {
		String j;
		boolean returN = true;
		for(int i = 1; i < a.length; i++) {
			j = a[i-1];
			if(j.compareTo(a[i]) > 0) {
				returN = false;
				i = a.length;
			}
		}
			return returN;
	}
	
}
