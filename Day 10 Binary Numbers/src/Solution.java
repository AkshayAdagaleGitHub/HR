import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int rem,counter =0,maxOne=0;
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		while(n>0) {
			rem = n%2;
			n=n/2;
			if(rem==1) {
				counter++;
				if(counter> maxOne) {
					maxOne=counter;
				}
			}else {
				counter=0;
			}
		}
		System.out.println(maxOne);
		scanner.close();
	}
}