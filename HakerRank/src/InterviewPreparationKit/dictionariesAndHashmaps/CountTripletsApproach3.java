package InterviewPreparationKit.dictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTripletsApproach3 {
	
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
		 
		 for(Long temp: arr)
		 {
			long leftCount = 0;
			long rightCount = 0;
			
			long lhs = 0;
			long rhs = temp * r;
			if(temp % r == 0)
			{
				lhs = temp/r;
			}
			
			
			rightMap.put(temp,rightMap.get(temp) -1);
			
			if(rightMap.containsKey(rhs)) {
				rightCount = rightMap.get(rhs);
			}
			
			if(leftMap.containsKey(lhs)) {
				leftCount = leftMap.get(lhs);
			}

			countPairs = countPairs + rightCount * leftCount;
			insertMap(leftMap, temp);
			
		 }
		 
		 return countPairs;
				 
	 }
	 
	 private static void insertMap(Map<Long,Long> map, Long r)
	 {
		 if(map.containsKey(r))
		 {
			 map.put(r, map.get(r) + 1);
		 }else {
			 map.put(r, 1L);
		 }
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
