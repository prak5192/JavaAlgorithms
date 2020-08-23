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
		//System.out.println(totalCount);
    	return totalCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String s = scanner.nextLine();

        //long n = scanner.nextLong();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	
    	long test = 1000000000000L;
    	
    	int i = (int)test;
    	System.out.println(test);
    	System.out.println(i);

        long result = repeatedString("aba", 100);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
