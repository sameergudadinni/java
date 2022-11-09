1)increasing order

import java.util.Scanner;
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  
  int n=sc.nextInt();
  
  for(int i=1; i<=n; i++){
   for(int j=1; j<=i; j++){
    System.out.print("");
   }
      System.out.println();
  }
}

output
// in increasing order
#
##
###
####

2)Deacresing order

import java.util.Scanner;
class Main{
public static void main(String[]args){
   int n=sc.nextInt();
  
  for(int i=1; i<=n; i++){
    for(int j=i; j<=n; j++){
      System.out.print("#");
    }
    System.out.println();
  }
}
}

output
####
###
##
#

3) Right Sided  Tringle

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1; i<=n; i++){
	    for(int j=i; j<=n; j++){
	        System.out.print(" ");
	    }
	    for(int j=1; j<=i; j++){
	        System.out.print("#"); 
	    }
	    System.out.println();  
	}
	}
}
output
      #
     ##
    ###
   ####
   
   4) Both sided Triengle
   import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1; i<=n; i++){
	    for(int j=i; j<=n; j++){
	        System.out.print(" ");
	    }
	    for(int j=1; j<=i; j++){
	        System.out.print("#"); 
	    }
	    for(int j=1; j<=i; j++){
	        System.out.print("#"); 
	    }
	    System.out.println();  
	}
	}
}

output
            #
	   ####
	  ######
	 ########
