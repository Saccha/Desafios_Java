import java.util.Scanner;
public class Array_Sum
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number;
        
        number = input.nextInt();
        
        for (int i = 1; i <= number; i++)
        {
            
            if (i % 2 == 0 ) {
              System.out.println(i);
            }
        }
        
        
    }
} 
