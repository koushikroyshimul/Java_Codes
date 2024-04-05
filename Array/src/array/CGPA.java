// count total CGPA 

package array;

import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int No_of_Sem; 
        int Total_Sem;
        double CGPA=0.0;
        double Total_credit=0.0;
        double Total_cgpa=0.0;
        double Total_sgpa=0.0;
        double SGPA[]=new double[20];
        double Credit[]=new double[20];
        System.out.print("Enter the number of semester: ");
        Total_Sem=input.nextInt();
        for(No_of_Sem=1;No_of_Sem<=Total_Sem;No_of_Sem++)
        {
            System.out.print("Enter SGPA for Semster "+No_of_Sem+":");
                SGPA[No_of_Sem] = input.nextDouble();             
                System.out.print("Enter Credit of Semester "+No_of_Sem+":");
                Credit[No_of_Sem] = input.nextDouble();
                Total_sgpa += SGPA[No_of_Sem]*Credit[No_of_Sem];
                Total_credit += Credit[No_of_Sem];
        }
        CGPA = Total_sgpa/Total_credit;       
        System.out.println("You CGPA is:"+String.format("%.2f",CGPA)); 
    }
}