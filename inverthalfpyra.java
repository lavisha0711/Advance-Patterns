import java.util.*;

public class inverthalfpyra
{
    public static void inverted_half_pyramidwithnumbers(int n)
    {
        //outer loop for lines
        for(int i = 1; i<= n; i++)
        {
            //inner loop for numbers
            for(int j =1; j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int n = sc.nextInt();

        inverted_half_pyramidwithnumbers(n);
    }
}