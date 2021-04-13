#30DaysOfCode
#HackerRank



#Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent 
(the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

Example:
meal_cost = 100
tip_percent = 15
tax_percent = 8
A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value 123 and return from the function.

#Function Description
#Complete the solve function in the editor below.

solve has the following parameters:

int meal_cost: the cost of food before tip and tax
int tip_percent: the tip percentage
int tax_percent: the tax percentage
Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

#Input Format

There are 3 lines of numeric input:
The first line has a double,meal_cost  (the cost of the meal before tax and tip).
The second line has an integer,tip_percent  (the percentage of  being added as tip).
The third line has an integer,tax_percent  (the percentage of  being added as tax).

#Sample Input
12.00
20
8
#Sample Output

15


#solution
public class Solution {

    // Complete the solve function below.
   static void solve(double meal_cost, int tip_percent, int tax_percent) {
    double total_cost =meal_cost+(tip_percent* meal_cost)/100.0+(tax_percent*meal_cost)/100.0;
    
    System.out.println(Math.round(total_cost));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);
        
        
             scanner.close();
    }
}
