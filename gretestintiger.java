import java.util.*;  //this code is good
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a= scn.nextInt();
    int b= scn.nextInt();
    int c= scn.nextInt();
    if (a>b) {
      if (a>c) {
        System.out.println("a is the greatest number");
      } else { System.out.println("c is the gretest number");}
    } else if (b>c) {
      System.out.println("b is the gretest number");
    } else {System.out.println("c is the gretest number"); }
  }   
}

// other ways to do 

import java.util.*;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a= scn.nextInt();
    int b= scn.nextInt();
    int c= scn.nextInt();
    if (a>b && a>c)
       {
        System.out.println("a is the greatest number");}
     else if(b>a && b>c) {
      System.out.println("b is the gretest number");} 
      else { System.out.println("c is the gretest number");}
  }   
}
