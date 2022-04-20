import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int first=0;
        int second=1;
        for( int row=1;row<=n  ;row++  ) {
            
            for( int i=1 ;i<=row  ;i++  ) {
                int sum=first+second;

                System.out.print(first+"\t");
                first=second;
                second=sum;
                
            }
            System.out.println();
        }

    }
}