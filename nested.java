public static void main (String[]args){
  int a=5;
  int b=10;
  int c=7;
  int max;
   if(a>b){
    if(a>c){
        max=a; 
    }
     else{
        max=c;   
     }
     else{
       if(b>c){
          max=b;      
       }
       else{
          max=c;
       }
         }
     System.out.prontln(max);
   }
  
}


output
10
