
package program1;

import java.util.Scanner;


public class StringInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String Name;
        System.out.print("Enter your name: ");
        Name=input.nextLine();
        System.out.println("Welcome: "+Name);
    }
}
