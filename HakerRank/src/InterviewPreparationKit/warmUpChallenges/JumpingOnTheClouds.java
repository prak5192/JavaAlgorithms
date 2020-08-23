package InterviewPreparationKit.warmUpChallenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
			
		int counts2 = 0;
		for(int i = 0; i< c.length ;)
		{
			if(i == 0 && c[i] == 0) {
				i++;
			}else {
				if((i + 1) < c.length) {
					if(c[i + 1] == 0 ) {
						 i = i + 2;
					}else if(c[i] == 0) {
						i++;
					}
				}else {
					if(c[i] == 0) {
						i++;
					}
				}
				counts2++;
			}
			
		}
		
		return counts2;
    }



    public static void main(String[] args) throws IOException {
        int n = 6;
        int[] c = {0, 0, 1, 0, 0, 1, 0};

        int result = jumpingOnClouds(c);
        System.out.println(result);

    }
}