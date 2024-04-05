
package program1;

import java.util.Scanner;


public class Series3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n,result=1;
        System.out.print("Enter the last number : ");
        n=input.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.println(i+"X"+i);
            result=result*(i*i);
        }
        System.out.println();
        System.out.println(result);
    }
}
