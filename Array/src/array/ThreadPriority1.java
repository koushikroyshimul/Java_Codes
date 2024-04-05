
package array;

import java.util.Scanner;

class Max extends Thread
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
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Maximum number is  : "+max);
    }
}

public class ThreadPriority1 {
    public static void main(String[] args) {
        Max t1=  new Max();
        Max t2 = new Max();        
       
        t1.setName("t1 thread");
        t2.setName("t2 thread");
        
        t1.setPriority(10);
        t2.setPriority(2);
        
        t1.start();
        t2.start();
    }
}