import java.lang.reflect.Method;
import java.util.*;
import java.util.Scanner;
public class functionintro {
    public static void add1(int n1,int n2){
        int ans=n1+n2;
        System.out.println(ans);
    }
    public static int add2(int n1, int n2)
    {
        int ans=n1+n2;
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        
        add1(num1,num2);
        System.out.println(add2(num1, num2)); //agar ya line hata dege to blank print hoga sirf add2 wala function call karenege tab
    }

}
