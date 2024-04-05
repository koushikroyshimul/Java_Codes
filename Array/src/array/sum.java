// Sum of 5 number from an array 

package array;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] num = new int [10];
        System.out.print("Please Enter numbers : ");
        for(int i=0; i<5; i++)
        {
            num[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0; i<5; i++)
        {
            sum=sum+num[i];
        }
        System.out.println("Summation of 5 numbers : "+sum);
    }
}
