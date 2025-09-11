import java.util.*;
public class butterfly
{
    public static void butterfly(int n)
    {
        //for first half
        for(int i =1; i<=n; i++)
        {
            //for starts - i
            for(int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
            //for spaces - 2*(n-i)
            for(int j =1;j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            //for starts -i
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //for last half
        for(int i =n; i>=1; i--)
        {
            //for starts - i
            for(int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
            //for spaces - 2*(n-i)
            for(int j =1;j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            //for starts -i
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        butterfly(n);
    }
}