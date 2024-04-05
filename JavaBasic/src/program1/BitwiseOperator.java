
package program1;

public class BitwiseOperator {

    public static void main(String[] args) {
        int a=16,b=32;
        int c;
        c=a&b;
        System.out.println("Bitwise AND : "+c);
        c=a|b;
        System.out.println("Bitwise OR : "+c);
        c=a^b;
        System.out.println("Bitwise XOR : "+c);
        c=a>>2;
        System.out.println("Bitwise Right Shift : "+c);
        c=a<<2;
        System.out.println("Bitwise Left Shift : "+c);
    }
}
