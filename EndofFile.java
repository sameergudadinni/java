// The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

// Hint: Java's Scanner.hasNext() method is helpful for this problem.

// Input Format

// Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

// Output Format

// For each line, print the line number, followed by a single space, and then the line content received as input.

// Sample Input

// Hello world
// I am a file
// Read me until end-of-file.


import java.io;
import java.util.Scanner;

public static void main(String[]args){
    Scanner in=new Scanner(System.in);
  
  int n=1;
  while(in.hasNextLine()){
        System.out.println(n++ +" "+in.nextLine());         
  }
  in.close();
}
