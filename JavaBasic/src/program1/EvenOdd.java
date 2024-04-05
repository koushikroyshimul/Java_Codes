
package program1;

import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int num; 
        System.out.print("Enter any number : ");
        num=a.nextInt();
        if(num%2==0)
            System.out.println("Number is Even");
        else 
            System.out.println("Number is Odd");
    }
}
