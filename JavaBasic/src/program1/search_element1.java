
package program1;

import java.util.Scanner;


public class search_element1 {
    public static void main(String[] args) {
        int[] number={10,20,30,40,50};
        System.out.print("Array elements are: ");
        for(int i=0; i<5; i++)
        {
            System.out.print(number[i]+" ");
        }
        int n,count=0;
        System.out.print("\nEnter search Element : ");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        for(int i=0; i<5; i++)
        {
            if(number[i]==n)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Item Found "+count+" times");
        }
        else 
        {
            System.out.println("Item Not Found");
        }
    }
}
