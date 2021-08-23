import java.util.*;
import java.lang.*;
public class Pattern{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string");
        String str=new String(input.next());
        StringBuilder str1=new StringBuilder(str);
        str1=str1.reverse();
        int n=str.length();
        for(int i=0;i<str.length()-1;i++)
        {
            for (int j = i+1; j < (str.length()) ; j++) {
                System.out.print(" ");
            }
            System.out.print(str.substring(0,i)+ str1.substring(n-i-1,n));
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for (int j =i; j<n-1 && j>=0; j++) {
                System.out.print(" ");
            }
            System.out.print(str.substring(0,i)+ str1.substring(n-i-1,n));
            System.out.println();
        }
        System.out.println("Patter Printed Successfully");

    }
}