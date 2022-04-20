import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count=1;
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        for( int row=1;row<=n  ;row++  ) {
            
            for( int i=1 ;i<=row  ;i++  ) {
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }

    }
}