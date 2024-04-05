// implement thread program entends from thread class 
package array;

class Myclass extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread is running");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        Myclass t1=  new Myclass();
        t1.start();
    }
}
