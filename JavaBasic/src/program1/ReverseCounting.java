
package program1;

import java.util.Scanner;


public class ReverseCounting {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n;
        System.out.print("Enter input : ");
        n=input.nextInt();
        for(int i=n; i>=0; i--)
        {
            System.out.println(i);
        }
    }
}
