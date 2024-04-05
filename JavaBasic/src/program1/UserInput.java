
package program1;

import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter any number : ");
        number=input.nextInt();
        System.out.println("Number is : "+number);
    }
}
