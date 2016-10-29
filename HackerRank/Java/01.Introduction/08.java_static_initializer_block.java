/*
Static initialization blocks are executed when the class is loaded,
and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks.
You can read about it here.

You are given a class Solution with a main method.
Complete the given code so that it outputs the area of a parallelogram with breadth B and height H.
You should read the variables from the standard input.

If B <= 0 or H <= 0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
*/

import java.io.*;
import java.util.*;
import java.text.*;

public class Solution{
	static Scanner scan = new Scanner(System.in);
	static boolean flag = true;
	static int B = scan.nextInt();
	static int H = scan.nextInt();

	static{
	    try{
	        if(B <= 0 || H <= 0){
	            flag = false;
	            throw new Exception("Breadth and height must be positive");
	        }
	    }catch(Exception e){
	        System.out.println(e);
	    }
	}

	public static void main(String[] args){
		if(flag){
			int area = B*H;
			System.out.print(area);
		}
	}
}