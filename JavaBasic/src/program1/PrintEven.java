
package program1;

import java.util.Scanner;


public class PrintEven {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n;
        System.out.print("Enter input");
        n=input.nextInt();
        for(int i=2; i<n; i=i+2)
        {
            System.out.println(i);                    
        }
    }
}
