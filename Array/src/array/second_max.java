// find the second maximum number from an array 

package array;

import java.util.Scanner;

public class second_max {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[]number = new int[5];
        System.out.print("Enter the array elemnts : ");
        for(int i=0;i<5;i++)
        {
            number[i]=input.nextInt();
        }
        int max = number[0];
        for(int i=0;i<5;i++)
        {
            if(max<number[i])
            {
                max=number[i-1];
            }
        }
        System.out.println("Second Maximum number is  : "+max);   
    }
}
