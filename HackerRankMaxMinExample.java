package practice.hacker.rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HackerRankMaxMinExample {
	
public static void miniMaxSum(List<Integer> arr) {
	
	
        
     Collections.sort(arr);
     
     long sumMin=0;
 	long sumMax=0;
     
     for(int i=0;i<arr.size()-1;i++) {
    	 sumMin=sumMin+arr.get(i);
     }
     
     for(int j=arr.size()-1;j>0;j--) {
    	 sumMax=sumMax+arr.get(j);
     }
     
     System.out.println(sumMin+" "+sumMax);

    }




	public static void main(String[] args) {
		List<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		miniMaxSum(arr);

	}

}
