import java.util.Scanner;

public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
       int input=sc.nextInt();
    if(input<0){
      System.out.println("integer is Negative");
    }
      else if(input>0){
      System.out.println("integer is Positive");
    }
  else{
        System.out.println("integer is Zero"); 
  }
}
