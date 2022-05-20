import java.util.*;
import java.util.Scanner;
class pattern
{
  
   public static void main(String[] args)  
 {  
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
    
     
       System.out.println();  
       int i, j, k;  
       for (i = 0; i < n + 1; i++) { for (j = n; j > i; j--) {  
               System.out.print(" ");  
           }  
           for (k = 0; k < (2 * i - 1); k++) {  
               System.out.print("*");  
           }  
           System.out.println();  
         }  
   }  
}   
