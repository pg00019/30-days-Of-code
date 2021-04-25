#30DaysOfCode on HACKERRANK

#Objective
The absolute difference between two integers, a and b , is written as |a-b|. 
The maximum absolute difference between two integers in a set of positive integers,elements ,
is the largest absolute difference between any two integers in _elements.
The Difference class is started for you in the editor. It has a private integer array (elements) for storing N non-negative integers, 
and a public integer (maximumDifference) for storing the maximum absolute difference.

#Task
Complete the Difference class by writing the following:
A class constructor that takes an array of integers as a parameter and saves it to the _elements instance variable.
A computeDifference method that finds the maximum absolute difference between any 2 numbers in  _elements and stores it 
in the maximumDifference instance variable.
  
#Input Format
You are not responsible for reading any input from stdin. 
The locked Solution class in the editor reads in 2 lines of input. 
The first line contains N, the size of the elements array. The second line has N space-separated integers that describe the  _elements array.
  
#Output Format

You are not responsible for printing any output;
the Solution class will print the value of the maximumDifference instance variable.
  
 #Sample Input

STDIN   Function
-----   --------
3       __elements[] size N = 3
1 2 5   __elements = [1, 2, 5]


#Sample Output

4

#Solution


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
Difference(int [] elements){
        this.elements = elements ;
    }
    public void computeDifference(){
        int diff = 0 ,maximumDifference1  = 0;
           for(int i = 0 ; i < elements.length ; i++){
               for(int j = i+1 ; j < elements.length ; j++){
                   diff = Math.abs(elements[i] - elements[j]);
                   if(maximumDifference1 < diff){
                       maximumDifference1 = diff ;
                   }
               }
           }
            maximumDifference = maximumDifference1;
    }


} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
