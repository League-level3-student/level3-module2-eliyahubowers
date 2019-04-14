package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test	
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] a = {"tra","la","fa","gra"};
		assertEquals(1 ,_00_LinearSearch.linearSearch(a,"la"));
		String[] b = {"ple","le","ne","jse"};
		assertEquals(2 ,_00_LinearSearch.linearSearch(b,"ne"));
		String[] c = {"glu","nu","wu","kru"};
		assertEquals(0 ,_00_LinearSearch.linearSearch(c,"glu"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] a = {1,2,4,15,24,28,37,39,41,44,49,53,55,60,100};
		assertEquals(7 ,_01_BinarySearch.binarySearch(a, 0, 14, 39));
		assertEquals(9 ,_01_BinarySearch.binarySearch(a, 0, 14, 44));
		assertEquals(1 ,_01_BinarySearch.binarySearch(a, 0, 14, 2));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		assertEquals(10 ,_02_InterpolationSearch.interpolationSearch(a, 11));
		int[] b = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190};
		assertEquals(15 ,_02_InterpolationSearch.interpolationSearch(b, 160));
		int[] c = {3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51};
		assertEquals(13 ,_02_InterpolationSearch.interpolationSearch(c, 42));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] a = {1,2,4,15,24,28,37,39,41,44,49,53,55,60,100};
		assertEquals(5 ,_03_ExponentialSearch.exponentialSearch(a,28));
		int[] b = {1,2,3,9,57,93,457,834,958,7000};
		assertEquals(9 ,_03_ExponentialSearch.exponentialSearch(b,7000));
		int[] c = {0,3,4,6,9,34,39,45,60,93,103,346,356,475,638};
		assertEquals(10 ,_03_ExponentialSearch.exponentialSearch(c,103));
	}
}
