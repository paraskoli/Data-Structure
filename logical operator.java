//  and operator
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1=scn.nextInt();
    if(n1>0 && n1<40) {
      System.out.println("number is valid");
    } else {System.out.println("invalid");
      
    }

  }
}
//  or opertaor

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1=scn.nextInt();
    if(n1>5 || n1%2==0) {
      System.out.println("valid");
    } else {System.out.println("invalid");
      
    }

  }
}

// not opertaor
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    if(n1!=n2) {
      System.out.println("valid");
    } else
    {System.out.println("invalid");
    }
    // if(n1==n2) {
    //   System.out.println("valid");
    // } else
    // {System.out.println("invalid");
      
    // }

  }
}