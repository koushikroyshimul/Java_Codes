
package program1;

import java.util.Scanner;


public class array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] number = new int[5];
        System.out.println("Enter 5 elements : ");
        for(int i=0; i<5; i++)
        {
            number[i]=input.nextInt();
             System.out.print(number[i]+" ");
        }
       
    }
 
}
