// find maximum number using thread 

package array;

import java.util.Scanner;

class Maximum extends Thread
{
    @Override
    public void run()
    {
        Scanner input = new Scanner(System.in);
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
                max=number[i];
            }
        }
        System.out.println("Maximum number is  : "+max);   
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        Maximum t1=  new Maximum();
        t1.start();
    }
}
