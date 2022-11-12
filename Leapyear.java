// Leap Year
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
// Explanation Since 1900 is divisible by 100 but not divisible by 400, so it is not a leap year.

// Constraints
// 1000 <= Y <= 9999

import java.util.Scanner;

public static void main(String[]args){
  Scanner sc=new Scanner(System.in){
     
    int year=sc.nextInt();
    
    if((year % 4 ==0) && (year % 100!== 0) || (year %400 ==0)){
        System.out.println("0");
    }
    System.out.println("1");
  }
}

