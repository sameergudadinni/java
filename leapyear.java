// Given a year, find if it is a leap year.

// A Leap year is the year that is multiple of 4. However, multiples of 100 except for the multiples of 400 are not leap years.

// Input Format
// An integer Y, denoting the year.

// Output Format
// Return 1, if the given year is a leap year or 0 otherwise.

// Example 1
// Input

// 2004
// Output

// 1
// Explanation

// 2004 is divisible 4 by hence it's a leap year

// Example 2
// Input

// 2000
// Output

// 1
// Explanation

// 2000 is divisible by 400 hence, it is a leap year.

// Example 3
// Input

// 1900
// Output

// 0
import java.util.Scanner;
public static void main(Sring[]args){
  Scanner sc=new Scanner(System.in);
  int Y=sc.nextInt();
    if(Y%4 == 0 && Y%100! Y%400 ==0 ){
      System.out.println("1");
    }
    else{
      System.out.println("0");
    }
  
}
