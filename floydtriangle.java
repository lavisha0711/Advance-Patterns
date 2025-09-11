import java.util.*;

public class floydtriangle
{
    public static void floyd_triangle(int n)
    {
        //outer loop for lines
        int counter = 1;
        for(int i = 1; i<= n; i++)
        {
            //inner loop for how many times counter is printed
            for(int j =1; j<=i;j++)
            {
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int n = sc.nextInt();

        floyd_triangle(n);
    }
}