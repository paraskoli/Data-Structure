import java.io.*;
import java.util.*;

public class findeleinarray{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
      int n=scn.nextInt(); //length
      int arr[]=new int[n]; //array
      for(int idx=0 ;idx<=n-1  ;idx++  ) {
          arr[idx]=scn.nextInt();
          
      }
     int element =scn.nextInt();//element
       int res=find(arr,element);
       System.out.println(res);
   }
  public static int find(int arr[],int element) {
     for( int idx=0 ;idx<=arr.length-1 ;idx++  ) {
         if (arr[idx]==element) {
             return idx; //element found
            }   
        }
      return -1; //element not found
    }
}