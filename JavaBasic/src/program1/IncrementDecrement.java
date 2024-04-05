
package program1;


public class IncrementDecrement {
    public static void main(String[] args) {
        int a=100;
        int y;
        y=a++;
        System.out.println("Y= "+y);
        y=a;
        System.out.println("Y= "+y);
        y=++a;
        System.out.println("Y= "+y);
        
        y=--a;
        System.out.println("Y= "+y);
        y=a--;
        System.out.println("Y= "+y);
        y=a;
        System.out.println("Y= "+y);
    }
}
