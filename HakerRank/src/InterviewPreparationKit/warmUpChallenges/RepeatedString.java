package InterviewPreparationKit.warmUpChallenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long count = 0;
    	
		long tempCount = 0;
		
		long mod = n%s.length();
		
		long queo = n/s.length();
		
		String restString = s.substring(0, (int)mod);
		
		for(int i = 0; i< restString.length(); i++)
		{
			if(restString.charAt(i) == 'a') {
				tempCount++;
			}
		}
		
		for(int i = 0; i< s.length() ; i++)
		{
			if(s.charAt(i) == 'a')
			{
				count++;
			}
		}
		
		long totalCount = (count*queo) + tempCount;
		
    	return totalCount;
    }


    public static void main(String[] args) throws IOException {
        String s = "aba";
        long n = 100;
        long result = repeatedString(s, n);
        System.out.println(result);
    }
}
