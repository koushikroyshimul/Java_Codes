
package program1;

import java.util.Scanner;
public class ArithmaticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        int sum,sub,mul;
        double division,modul;
        System.out.print("Enter any two numbers : ");
        a=input.nextInt();
        b=input.nextInt();
        sum=a+b;
        sub=a-b;
        mul=a*b;
        division=(double)a/b;
        modul=(double)a%b;
        System.out.println("Sum : "+sum);
        System.out.println("Sub : "+sub);
        System.out.println("Mul : "+mul);
        System.out.println("Division : "+division);
        System.out.println("Module : "+modul);
    }
    
}
