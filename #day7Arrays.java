#30DaysOfCode on HACKERRANK
#Task
Given an array, A, of N integers, print A's elements in reverse order as 
a single line of space-separated numbers.

Example

A=[1,2,3,4]
Print 4 3 2 1. Each integer is separated by one space.

Input Format:
The first line contains an integer, N (the size of our array).
The second line contains N space-separated integers that describe array A's elements.
  
#Output Format
Print the elements of array A in reverse order as a single line of space-separated numbers.
  
Sample Input

4
1 4 3 2

Sample Output
2 3 4 1
  
  #Solution
  
  
  public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        for (int j=n-1;j>=0;j--)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
