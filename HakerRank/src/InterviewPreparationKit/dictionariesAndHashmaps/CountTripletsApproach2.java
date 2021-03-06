package InterviewPreparationKit.dictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTripletsApproach2 {
	
	 static long countTriplets(List<Long> arr, long r) {
		 long countPairs = 0;
		 
		 Map<Long, Long> rightMap = new HashMap<Long, Long>();
		 Map<Long, Long> leftMap = new HashMap<Long, Long>();
		 
		 
		 for(Long temp: arr)
		 {
			 if(rightMap.containsKey(temp))
			 {
				 rightMap.put(temp, rightMap.get(temp) + 1);
			 }else {
				 rightMap.put(temp, 1L);
			 }
		 }
		 
		 for(Long val : arr)
		 {
			 rightMap.put(val,rightMap.get(val) - 1);
			 
			 if(leftMap.containsKey(val/r) && val%r == 0 && rightMap.containsKey(val*r))
			 {
				 countPairs = countPairs + leftMap.get(val/r) * rightMap.get(val*r);
			 }
			 
			 if(leftMap.containsKey(val)) {
				 leftMap.put(val, leftMap.get(val) + 1);
			 }else {
				 leftMap.put(val, 1L);
			 }
		 }
		 
		 return countPairs;
				 
	 }
	 
	
	
	public static void main(String args[])
	{
		long r = 3;
	       
        List<Long> arr = new ArrayList<Long>();
        
        arr.add(1L);
        arr.add(3L);
        arr.add(3L);
        arr.add(9L);
        arr.add(3L);
        arr.add(27L);
        arr.add(81L);
        
        long ans = countTriplets(arr, r);
        System.out.println(ans);

	}

}
