
package program1;

import java.util.Scanner;


public class minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] num= new int[5];
        System.out.println("Enter the array elemnts : ");
        for(int i=0; i<5; i++)
        {
            num[i]=input.nextInt();     
        }
        int min=num[0];
       for(int i=1; i<5; i++)
       {
          if(min>num[i])
              min=num[i];
       }
        System.out.println("Minimum number in the array is "+min);
    }
}
