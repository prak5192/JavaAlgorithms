package InterviewPreparationKit.warmUpChallenges;

import java.io.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int count = 0;
    	int test = 0;
    	int previousState = 0;
    	for(int i =0; i< s.length() ;i++)
    	{
    		if(s.charAt(i) == 'U') {
    			test = test +1;
    		}else {
    			test = test -1;
    		}
    		if(test < 0 && previousState >= 0) {
    			count++;
    		}
    		previousState = test;
    	}
    	return count;
    }


    public static void main(String[] args) throws IOException {
        int n = 8;
        
        String s = "UDDDUDUU";

        int result = countingValleys(n, s);

        System.out.println(result);
    }
}