;
package program1;

import java.util.Scanner;

public class Sumoftwo {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
    int a;
    double b;
    double sum;
    System.out.print("Enter two numbers: ");
    a=input.nextInt();
    b=input.nextDouble();
    sum=a+b;
    System.out.println("Summation : "+sum);
    }  
}
