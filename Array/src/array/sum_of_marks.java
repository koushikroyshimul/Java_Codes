
package array;

import java.util.Scanner;

public class sum_of_marks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] num = new int [10];
        int sum=0;
        for(int i=1; i<=5; i++)
        {
            System.out.print("Please Enter numbers "+i+" ");
            num[i]=input.nextInt();
            sum=sum+num[i];
        }
        System.out.println("Total marks "+sum);
    }
}
