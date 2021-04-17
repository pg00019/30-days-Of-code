#task
Given a string, S, of length N that is indexed from 0 to N-1, 
print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

 #Example:
s= adbecf

Print abc def

Input Format
The first line contains an integer, T(the number of test cases).
Each line i of the T subsequent lines contain a String, S.
  
#Sample Input
2
Hacker
Rank

#Sample Output
Hce akr
Rn ak

#Solution
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner (System.in);
        int T = in.nextInt();
        for(int i=1;i<=T;i++)
        {
          String S = in.next();
          for(int j=0;j<S.length();j++)
          {
            if(j%2==0)
            {
              System.out.print(S.charAt(j));
            }//end of if
          }// end of for loop
        System.out.print(" ");
       
       for(int j=0;j<S.length();j++)
       {
         if(j%2!=0)
         {
          System.out.print(S.charAt(j));
         }//end of if
       }// end of for loop
        System.out.println();
    }
    }//end of first loop
}
