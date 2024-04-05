
package program1;

import java.util.Scanner;


public class CelsioustoF {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double f,c;
        System.out.print("Enter temperature : ");
        f=input.nextDouble();
        c=((f-32)*5)/9;
        System.out.println("Temperature is : "+c);
    }
}
