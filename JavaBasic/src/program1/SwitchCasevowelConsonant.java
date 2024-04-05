
package program1;

import java.util.Scanner;


public class SwitchCasevowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char ch;
        System.out.print("Enter any charecter : ");
        ch = input.next().charAt(0);
        switch(ch)
        {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;   
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;   
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;  
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;   
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;  
            default:
                System.out.println("Consonant");
        }
    }
}
