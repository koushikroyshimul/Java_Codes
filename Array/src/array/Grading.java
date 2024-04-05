
package array;

import java.util.Scanner;


public class Grading {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int no_of_subject;
        int max_no_sub;
        double gpa = 0;
        double tcredit = 0;
        double SGPA = 0.0;
        System.out.print("Enter Maximum Number of Subject: ");
        max_no_sub = console.nextInt();
        
        double marks[] = new double[10];
        double grade[] = new double[10];
        double credit[] = new double[10];
        double result[] = new double[10];
        
        for(no_of_subject=1;no_of_subject<=max_no_sub;no_of_subject++)
                {
                        
                System.out.print("Enter marks for Subject "+no_of_subject+":");
                marks[no_of_subject] = console.nextDouble();
                
                System.out.print("Enter Credit of Subject "+no_of_subject+":");
                credit[no_of_subject] = console.nextDouble();
        if (marks[no_of_subject]>100)
        {
            System.out.println("Invalid Input");
        }
        else if (marks[no_of_subject]>=80)
        {
            grade[no_of_subject] = 4.00;
            System.out.println("A+");
        }
        else if ((marks[no_of_subject]<80)&&(marks[no_of_subject]>=75))
                {
                    grade[no_of_subject] = 3.75;
                    System.out.println("A");
                }
        else if ((marks[no_of_subject]<75)&&(marks[no_of_subject]>=70))
                {
                    grade[no_of_subject] = 3.50;
                    System.out.println("A-");
                }
        else if ((marks[no_of_subject]<70)&&(marks[no_of_subject]>=65))
                {
                    grade[no_of_subject] = 3.25;
                    System.out.println("B+");
                }
        else if ((marks[no_of_subject]<65)&&(marks[no_of_subject]>=60))
                {
                    grade[no_of_subject] = 3.00;
                    System.out.println("B");
                }
        
        else if ((marks[no_of_subject]<59)&&(marks[no_of_subject]>=0))
        {
            grade[no_of_subject] = 0.00;
            System.out.println("Fail");
        }
        else if (marks[no_of_subject]<0)
        {
            System.out.println("Invalid Input");
        }
        result[no_of_subject] = grade[no_of_subject]*credit[no_of_subject];
        gpa += result[no_of_subject];
        tcredit += credit[no_of_subject];        
    }
        SGPA = gpa/tcredit;
        System.out.println("You SGPA is: "+SGPA);
    }  
}