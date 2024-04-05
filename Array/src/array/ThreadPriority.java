package array;

class JavaGetPriorityExp extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Running tread name"+Thread.currentThread().getName());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        JavaGetPriorityExp t1=  new JavaGetPriorityExp();
        JavaGetPriorityExp t2 = new JavaGetPriorityExp();
        System.out.println("t1 thread priority : "+ t1.getPriority());
        System.out.println("t2 thread priority : "+ t2.getPriority());
        t1.start();
        t2.start();
    }
}



