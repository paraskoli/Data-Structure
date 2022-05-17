import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{ 
      Scanner scn=new Scanner(System.in);   
      int n= scn.nextInt();
    
     int arr[]=new int[n];

      for( int idx=0 ; idx <=arr.length-1  ; idx++ ) {
          arr[idx]=scn.nextInt();
        
         }
      int max=arr[0];
      int min=arr[0];
      for (int idx=1; idx<=arr.length-1; idx++)
       {
         if (arr[idx]>max)
           {
            max=arr[idx];
           }
           if (arr[idx]<min)
           {
            min=arr[idx];
           }
        } 
        int span=max-min;
        System.out.println(span);


    }

}