



#Task
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to , 5print Not Weird
If n is even and in the inclusive range of 6 to ,20 print Weird
Ifn  is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not n  is weird.
  
  #Input Format

A single line containing a positive integer,Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird .
  
  
  
  #solution:
public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==0)
        {
          if (N>=2 && N<=5 )
           System.out.println("Not Weird");
           else if (N>=6 && N<=20 )
           System.out.println("Weird");
           else
            System.out.println("Not Weird");
        }
        else{
              System.out.println("Weird");
        }
        scanner.close();
    }
}
