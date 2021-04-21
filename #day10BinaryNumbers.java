#30DaysOfCode on HACKERRANK

#task
Given a base-10 integer,n , convert it to binary (base-2). 
Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
When working with different bases, it is common to show the base as a subscript.

Example
n=125
The binary representation of (125) to base 10 is (1111101) to the base 2 .
  In base 10, there are 5 and 1 consecutive ones in two groups. Print the maximum,5 .

#Input Format
 
 A single integer, n .
  
#Output Format
Print a single base-10 integer that denotes the maximum number of consecutive 1's 
  in the binary representation of n.

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
  
  
  #Solution
  
   public static void main(String[] args) {
        int n = scanner.nextInt();
        int count=0;
        int min=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(n > 0){
          if(n%2==1)
          {
              count ++;
              if(count>=min)
              min= count;
          }
           else
           count=0;
           n=n/2;
        }
        System.out.println(min);
           
        scanner.close();
    }
