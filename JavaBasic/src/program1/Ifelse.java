
package program1;

import java.util.Scanner;


public class Ifelse {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int num;
        System.out.print("Enter any number : ");
        num=a.nextInt();
        if(num>0)
        System.out.println("Number is Positive");
        else if(num<0)
             System.out.println("Number is Negative");   
        else 
            System.out.println("Number is Zero");        
    }   
}

