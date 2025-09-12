import java.util.*;
public class hollowrect
{
    public static void hollow_rectangle(int totalrow , int totalcol)
    {
        //outer loop for number of lines or rows
        for(int i =1; i<= totalrow; i++)
        {
            //innner loop for columns
            for(int j = 1; j<= totalcol; j++)
            {
                //cell (i,j)
                if(i == 1 || i == totalrow || j == 1 || j == totalcol)
                {
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
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

        hollow_rectangle(totalrow,totalcol);
    }
}