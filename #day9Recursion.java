#30DaysOfCode on HACKERRANK

#task

Find the factorial of n using recursion 

#Function Description
Complete the factorial function in the editor below. Be sure to use recursion.

#factorial has the following paramter:

int n: an integer
Returns 

int: the factorial of n


Input Format

A single integer, n (the argument to pass to factorial).

Sample Input

3
Sample Output

6

#Solution

public class Solution {

    // Complete the factorial function below.
    static int factorial(int n) {
    // Recursive Case
    if(n <= 1) { 
          return 1;
    // Base Case n = 1
    }else { 
        return n*factorial(n-1);
    }
}
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
