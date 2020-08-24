package InterviewPreparationKit.dictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.List;

public class CountTripletsApproach1 {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
    	long count = 0;
    	
    	
    	for(int i = 0; i< arr.size(); i++ )
    	{
    		for(int j = i+1; j<arr.size(); j++)
    		{
    			if( arr.get(i) * r  == arr.get(j)) 
    			{
    		 		for(int k = j+1 ; k < arr.size(); k++) 
    				{
    					if(arr.get(j) * r == arr.get(k)) 
    					{
    						count++;
    						
    					}
    				}
    			}
    		}
    	}
    	
    	return count;

    }

    public static void main(String[] args) {
        long r = 2;
       
        List<Long> arr = new ArrayList<Long>();
        
        arr.add(1L);
        arr.add(2L);
        arr.add(1L);
        arr.add(2L);
        arr.add(4L);
        
        long ans = countTriplets(arr, r);
        System.out.println(ans);

    }
}
