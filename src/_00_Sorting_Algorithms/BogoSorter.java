package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean b = false;
		Random r = new Random();
		int one = 0;
		int two = 0;
		int swap;
		while(b == false) {
			b = true;
			for(int i = 1; i < array.length; i++) {
				if(array[i-1] > array[i]) {	
					b = false;
				}
			}
			if(b != true) {
				one = r.nextInt(array.length);
				two = r.nextInt(array.length);
				swap = array[one];
				array[one] = array[two];
				array[two] = swap;
			}
			display.updateDisplay();
		}
	}
}
