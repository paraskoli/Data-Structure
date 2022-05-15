public class arrayintro {
       public static void main(String[] args) {
           int arr[]= new int[5];
           
           arr[0]=5;
           arr[1]=6;
           arr[2]=9;
           arr[3]=10;
           arr[4]=46;

        //    System.out.println(arr[0]);
        //    System.out.println(arr[1]);
        //    System.out.println(arr[2]);
        //    System.out.println(arr[3]);
        //    System.out.println(arr[4]);
           
           System.out.println("length :"+arr.length);
           for (int idx=0; idx<=arr.length-1; idx++) {
               int val =arr[idx];
               System.out.println(val+" ");

           }
           System.out.println();
           // for each loop//
          for (int val : arr) {
              System.out.print(val+" ");
              
          }
            System.out.println();


        }
    
}
