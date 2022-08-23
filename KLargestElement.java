package practiceNew;

import java.util.Arrays;
import java.util.Collections;

public class KLargestElement {
	
	public static void kLargestArray(Integer[] input,int k) {
		Arrays.sort(input, Collections.reverseOrder());
		
		for(int i=0;i<k;i++) {
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {

		Integer[] input= new Integer[] {67,89,45,36,98};
		kLargestArray(input, 2);
		

	}

}
