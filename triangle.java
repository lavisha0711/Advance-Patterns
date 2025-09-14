import java.util.*;

public class triangle
{
    public static void triangle(int totalrow,int totalcol)
    {
        //outer loop for lines
        for(int i = 1; i<= totalrow; i++)
        {
            //inner loop for numbers
            for(int j =1; j<=i;j++)
            {
                if((i+j) % 2 == 0)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of rows:");
        int totalrow = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int totalcol = sc.nextInt();


        triangle(totalrow,totalcol);
    }
}