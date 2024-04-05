
package program1;

import java.util.Scanner;


public class Loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("Enter input: ");
        a=input.nextInt();
        for (int i=1; i<=a; i++)
        {
            System.out.println(i);
        }
    }
}
