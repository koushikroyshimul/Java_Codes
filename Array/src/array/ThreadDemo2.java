// implement thread program using runnable interface method 
package array;

class MyClass implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread is running");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
