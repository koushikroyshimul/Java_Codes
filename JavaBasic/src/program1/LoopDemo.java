
package program1;

import java.util.Scanner;


public class LoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n,sum=1,i;
        System.out.print("Enter Input : ");
        n=input.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
