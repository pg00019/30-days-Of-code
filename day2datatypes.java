Hackerrank 30 days of code
# Day1: Data Types

# Task
# Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must declare
# variables: one of type int, one of type double, and one of type String. Then you must read 3 lines of input from stdin and initialize
# your variables. Finally, you must use the + operator to perform the following operations:

# Print the sum of i plus your int variable on a new line.
# Print the sum of d plus your double variable to a scale of one decimal place on a new line.
# Concatenate s with the string you read as input and print the result on a new line.
# Note: If you are using a language that doesn't support using + for string concatenation (e.g.: C), you can just print one variable
# immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the
# string you read as input.

# Input Format
# The first line contains an integer, i.
# The second line contains a double, d.
# The third line contains a string, s.

# Output Format
# Print the sum of both integers on the first line, the sum of both doubles (scaled to 1 decimal place) on the second line, and then the
# two concatenated strings on the third line.

  #solution
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
     
       
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s + c);
        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
