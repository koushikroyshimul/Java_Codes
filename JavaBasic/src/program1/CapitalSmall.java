
package program1;

import java.util.Scanner;
public class CapitalSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char ch;
        System.out.print("Enter any charecter : ");
        ch = input.next().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println("Small Letter");
        else 
            System.out.println("Capital Letter");
    }
}
