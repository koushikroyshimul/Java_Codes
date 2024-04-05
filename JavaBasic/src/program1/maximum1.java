package program1;

public class maximum1 {
    public static void main(String[] args) {
        int[]number = {4,7,9,10,15};
        System.out.print("Array elements are : ");
        for(int i=0; i<5; i++)
        {
        System.out.print(number[i]+ " ");
        }
        int max=number[0];
        for(int i=1;i<5;i++)
        {
            if(max<number[i])
            {
                max=number[i-1];             
            }
        }
        System.out.println("\n2nd Maximum Number in the array is " +max);
    }
}
