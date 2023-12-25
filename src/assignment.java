
import java.util.Scanner;
public class assignment {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);    
System.out.print("Enter a number:");  
int a= sc.nextInt();  
        int n,b=0,c=0,sum=0;
    for(n=1; n<=a; n++)
     {
      if(n%2==0){
           b=-n;
      System.out.print(b);}
      else{
          c = n;
       System.out.print(c);  } 
      
      sum+=b;
     }
    System.out.print(" number:"+sum);  
   }
 }

    
    
     
    
 
   
 