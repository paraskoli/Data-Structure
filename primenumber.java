import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num=scn.nextInt();
      for( i=0;i<=num ;i++  ) {
         System.out.println("enter"+num);
         
      }
      int flag=1;
      for( int i=2; i*i<=num; i++)
      //i<=(num-1);
      //i<=(num/2)
       {
         if (num%i==0) {
            System.out.println("number is not prime");
            flag=0;
            break;
         } 
      
      } 
      if (flag==1) {
         System.out.println("prime");
         
      } else { System.out.println("not prime");
         
      }
   }
  }

// prime number with multiple output

  import java.util.*;
import java.util.Scanner;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       int t = scn.nextInt();
        
           for(int k=1; k<=t; k++)
           {
             int num =scn.nextInt();
           

       int flag=1;
       for( int i=2; i*i<=num; i++ ) {
         if (num % i ==0) {
           flag =0;
           break;
         } 
       }
       if(flag==1)
       {
         System.out.println("prime");
       }
       else{
         System.out.println("not prime");
       }
           }  
   }
  }