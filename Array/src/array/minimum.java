// Finding minimum from anbarray 

package array;

import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] number =  new int[10];
        System.out.print("Enter array elements : ");
        for(int i=0; i<5; i++)
        {
            number[i] = input.nextInt();
        }
        int min = number[0];
        for(int i=0;i<5;i++)
        {
            if(min>number[i])
            {
                min=number[i];
            }
        }
        System.out.println("Minimum number is  : "+min); 
    }
}
