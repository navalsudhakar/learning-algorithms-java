package practice.hacker.rank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class CandleHeightExample {
	
	public static int birthdayCakeCandles(List<Integer> candles) {
		Map<Integer,Integer> map= new HashMap<>();
		
				
		for(int i=1;i<candles.size();i++) {
			

			
			if(map.containsKey(candles.get(i))) {
				map.put(candles.get(i), map.get(candles.get(i))+1);
			}
			else {
				map.put(candles.get(i), 1);
			}
			
		}
		
	Optional<Entry<Integer, Integer>> local = map.entrySet().stream().max(Map.Entry.comparingByValue());
	return local.get().getValue();
	    
    }

	public static void main(String[] args) {
		List<Integer> arr= new ArrayList<>();
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		
		System.out.println(birthdayCakeCandles(arr));

	}

}
