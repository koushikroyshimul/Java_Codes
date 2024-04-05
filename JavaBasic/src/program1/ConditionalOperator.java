
package program1;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1,num2,num3,large;
        System.out.print("Enter three numbers : ");
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();
        large= num1>num2 ? (num1>num3 ? num1 : num3) : (num2>num3 ? num2 : num3);
        System.out.println("large number is = "+large);
    }
 
}
