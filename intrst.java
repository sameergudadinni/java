// Simple Interest Calculation
// Alice is expanding his current business and requires money for that. His friend Bob has agreed to lend him Rs 1,00,000 for a period of 5 years at a simple interest rate r%. How much money (Principle + Interest) should Alice return to Bob at the end of 5 years?

// Simple interest formula is given by:

// Simple Interest = (P x T x R)/100 
 
// where, P is the principle amount  
// 	   T is the time and  
// 	   R is the rate of interest
// Input Format
// An integer, representing simple interest rate.

// Output Format
// Return an integer representing final amount to be returned to Bob.

// Constraints
// 1 < = r < = 100

// Example
// Sample Input 1

// 10
// Sample Output 1

// 150000
// Sample Input 2

// 6
// Sample Output 2

// 130000

import java.util.Scanner;

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
     int rate=sc.nextInt();
      int p=100000;
       int t=5;
         int intrest=(rate*p*t)/100;
          System.out.println(p+intrest);
  
  
}
