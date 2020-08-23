package InterviewPreparationKit.warmUpChallenges;

import java.io.*;
import java.util.*;


public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	
    	int count = 0;
    	
    	Map<Integer, Integer> map = new HashMap<Integer, Integer> ();

    	for(int i =0; i< ar.length ; i++)
    	{
    		if(map.containsKey(ar[i])) {
    			map.put(ar[i], map.get(ar[i]) + 1);
    		}else {
    			map.put(ar[i], 1);
    		}
    	}
    	
    	for(Map.Entry<Integer, Integer> set : map.entrySet()) {
    		count = count + set.getValue()/2;
    	}

    	
    	return count;
    }


    public static void main(String[] args) throws IOException {
    	int n = 9;
    	int[] ar  = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, ar);
        System.out.println(result);
      
    }
}
