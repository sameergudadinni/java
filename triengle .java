// Which angled triangle
// Given the 3 sides of a triangle, find out whether it is acute-angled, right-angled, or obtuse-angled.

// You need to output 1 for acute, 2 for right-angled, and 3 for an obtuse-angled triangle. You can assume that the input values always form a triangle and are valid integers.

// Note:
// A triangle is acute-angled, if twice the square of the largest side is less than the sum of squares of all the sides.

// A triangle is obtuse-angled, if twice the square of its largest side is greater than the sum of squares of all the sides.

// A triangle is right-angled, if twice the square of its largest side is exactly equal to the sum of squares of all the sides.

// Input:
// 3 4 5

// Output:
// 2

// Explanation:
// Since 2x5x5 is equal to 5x5 + 3x3 + 4x4, So this is a right-angled triangle and hence, the answer is 2.

// Input:
// 3 3 3

// Output:
// 1

// Explanation:

import java.util.Scanner;

public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  
   Main m=new Main();
  
  public static int triangle(int a, int b,int c){
     if(2*c*c==a*a+b*b+c*c){
        return 2; 
     }
        else if(2*c*c==a*a+b*b+c*c){
          return 1;
  }
    else{
          return 3;      
    }
}
