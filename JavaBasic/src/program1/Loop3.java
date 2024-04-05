
package program1;

import java.util.Scanner;


public class Loop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n,sum=0;
        System.out.print("Enter any number : ");
        n=input.nextInt();
        for(int i= 1; i<=n; i++)
        {
            System.out.println(i+"X"+i);
            sum= sum+i*i;
        }
        System.out.println("Total Sum ");
        System.out.println(sum);
    }
}
