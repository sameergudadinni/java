// Inverted Right Triangle Star Pattern
// In this task, you have to print the following inverted right triangle star pattern.

// * * * *
// * * *
// * * 
// *
// Input Format
// There is no input for the program.

// Output Format
// * * * *
// * * *
// * * 
// *

public static void main(String[]args){
  for(int i=4; i>=1; i--){
    for(int j=1; j<=i; j++){
       System.out.print("* ");
    } 
      System.out.println();
  }
}
