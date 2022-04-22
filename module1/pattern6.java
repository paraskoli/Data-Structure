import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int row=1,nspaces=1,nstars=(n/2)+1;
        while ( row<=n )
         {
            
       //code for each row
         
         //1.print stars
          for(int i=1;i<=nstars;i++)
          {  
              System.out.print("*\t");
          }
         //2.print space
         for(int i=1;i<=nspaces;i++)
         {
             System.out.print("\t");
         }
         //3.print stars
         for(int i=1;i<=nstars;i++)
         {
             System.out.print("*\t");
         }

         // move to next line
         System.out.println();

         //preparation for next row
        
        if ( row<=n/2 ) 
        {   
            //first half
            nstars=nstars-1;
            nspaces=nspaces+2;            
        }else{
            //second half
            nstars=nstars+1;
            nspaces=nspaces-2;
        }

        row++;
         }

    }
}