
package program1;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int height,base,radious;
        int area1;
        double area2;
        System.out.print("Enter Height: ");
        height=input.nextInt();
        System.out.print("Enter Base: ");
        base=input.nextInt();
        area1=height*base;
        System.out.println("Area of a rectangle : "+area1);
        
        System.out.print("Enter Radious: ");
        radious=input.nextInt();
        area2=3.1416*radious;
        System.out.println("Area of a Circle: "+area2);
    }
   
}
