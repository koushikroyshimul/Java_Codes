// sum 5 numbers from array and find avg accept maximum & minimum number

package array;

import java.util.Scanner;

public class sum_avg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []number= new int[10];
        int sum=0;
        System.out.print("Enter Array Elements: ");
        for(int i=0; i<5; i++)
        {
            number[i]=input.nextInt();
        }
        int max=number[0];
        for(int i=1; i<5; i++)
        {
            if(max<number[i])
            {
                max=number[i];
            }
        }
        System.out.println("Maximum "+max);
        int min=number[0];
        for(int i=1; i<5; i++)
        {
            if(min>number[i])
            {
                min=number[i];
            }
        }
        System.out.println("Minimum "+min);
        
        for(int i=0; i<5; i++)
        {
            sum=sum+number[i];
        }  
        System.out.println("Total sum of 5 numbers "+sum);  
        sum=sum-min-max;
        double avg= sum/3;
        System.out.println("Average "+avg);    
    }
}
