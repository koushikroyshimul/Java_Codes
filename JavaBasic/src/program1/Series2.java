
package program1;

import java.util.Scanner;


public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n,result=1;
        System.out.print("Enter last number : ");
        n=input.nextInt();
        for(int i =1; i<=n; i++)
        {
            System.out.print(i+" ");
            result=result*i;
        }
        System.out.println();
        System.out.println(result);
    }
}
