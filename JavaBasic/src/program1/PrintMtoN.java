
package program1;

import java.util.Scanner;


public class PrintMtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int m,n,sum=0;
        System.out.print("Enter Initial Number : ");
        m=input.nextInt();
        System.out.print("Enter Ending Number : ");
        n=input.nextInt();
        for(int i=m; i<=n; i=i+2)
        {
            sum=sum+i;            
        }
        System.out.println(sum);
    }
}
