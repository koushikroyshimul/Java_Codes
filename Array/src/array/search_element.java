// search an elemnt from an array 

package array;

import java.util.Scanner;

public class search_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number =  new int[5];
        System.out.print("Enter array elements: ");
        for(int i=0; i<5; i++)
        {
            number[i]= input.nextInt();
        }
        int n,count=0;
        System.out.print("Enter Search Element: ");
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
            System.out.println("Item Found "+count+"times");
        }
        else 
        {
            System.out.println("Item Not Found");
        }
    }
}
