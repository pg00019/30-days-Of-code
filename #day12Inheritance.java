#30DaysOfCode on HACKERRANK

#Task
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has  parameters:
A string,firstName .
A string,lastName .
An integer,idNumber .
An integer array (or vector) of test scores, .
A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
   
  
grade  | average 

O      | 90<=a<=100
E      | 80<=a<90
A      | 70<=a<80
P      | 55<=a<70
D      | 40<=a<55
T      | a<40

  #Input Format

The locked stub code in the editor reads the input and calls the Student class constructor with the necessary arguments. 
It also calls the calculate method which takes no arguments.
The first line contains firstName,lastName, and idNumber , separated by a space. 
The second line contains the number of test scores. The third line of space-separated integers describes scores .
  
#Output Format

Output is handled by the locked stub code.
Your output will be correct if your Student class constructor and calculate() method are properly implemented.

#Sample Input
Heraldo Memelli 8135627
2
100 80

  
#Sample Output

 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
 
 #Solution
 
 
 class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    
        public Student(String firstName, String lastName, int identification, int[] testScores)
    {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    char calculate()
    {
        int sum = 0;
        int avg = 0;
        char grade = ' '; 
        for(int n : testScores)
        {
            sum += n;
        }
        if(testScores.length != 0)
            avg = (int)Math.ceil(sum/testScores.length);

       // System.out.println("sum : " + sum);    
       // System.out.println("avg : " + avg);    

        if(avg >=90 && avg <=100)
            grade = 'O';
        else if(avg >=80 && avg <90)
            grade = 'E';
        else if(avg >=70 && avg <80)
            grade = 'A';
        else if(avg >=55 && avg <70)
            grade = 'P';
        else if(avg >=40 && avg <55)
            grade = 'D';
        else if(avg <40)
            grade = 'T';

        return grade;
    }
}


class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}



