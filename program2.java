import java.util.*;

public static void main(String[]args){
  Scanner scan=new Scanner(System.in);
  int t=scan.nextInt();
  
  int a=scan.nextInt();
  int b=scan.nextInt();
  int c=scan.nextInt();
  
  for(int j=0; j<c; j++){
    a =a +(int)Math.pow(2,j) * b ;
    System.out.print(a+" ");
  }
System.out.println();

}

