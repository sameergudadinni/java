// Divisible Sum Pairs
// Given an array of integers, arr, and a positive integer k, determine the number of (i,j) pairs in the array where i<j and arr[i] + arr[j] is divisible by k.

// Input Format
// Input consists of two lines.

// The first line contains 2 space-separated integers, n (size of array) and k.

// The second line contains n space-separated integers, each a value of arr[i].

// Output Format
// Print the number of pairs a[i] + a[j] divisble by k, where i<j.

// Example 1
// Input

// 6 3          
// 1 3 2 6 1 2
// Output

// 5

import java.util.Scanner;
public class soln{
public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int arr[]=new int[];
  
  for(int i=0; i<n; i++){
    arr[i]=sc.nextInt();
  }
  int ans=0;
  for(int i=0; i<n' i++){
        for(int j=i+1; j<n; j++){
           if(arr[i]+arr[j] %k==0){
              ans++;
           }
        }
      }
      System.out.println(ans);
}}
