
package program1;

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.print("Enter number : ");
        n=input.nextInt();
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++){
              System.out.println("* "); 
            }                
        }
        System.out.print("\n");
    }
}
