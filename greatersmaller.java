import java.util.*;
import java.util.Scanner;
public class Main 
{

  public static void main(String[] args)  
  {
   Scanner scn= new Scanner(System.in);
   int n1=scn.nextInt();
   int n2=scn.nextInt();
   if (n1==n2) {
     System.out.println("both are equal");
   } else if (n1>n2) {
     System.out.println("n1 is greater than n2");
     
   } else {
     System.out.println("n2 is greater than n1");
     
   }
  }