//Sophia Hostetler
//U27264415
//Multiplication table
import java.util.Scanner;

public class MultiplicationTables
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
   int column, numc;
   System.out.print("Enter number of columns: ");
   column = scan.nextInt();
   while (column <= 2)
   {
   System.out.print("Sorry, value must be greater than 2.");
   System.out.print("Enter number of columns: ");
      column = scan.nextInt();
      }
      System.out.println("Here's your table: ");
      int mtable[][] = new int[12][column];
   for (int row = 0; row < mtable.length; row++) 
   for (numc = 0; numc < mtable[row].length; numc++)
   mtable[row][numc] = (row + 1) * (numc + 1);
   for (int row = 0; row < mtable.length; row++)
   {
   for (numc = 0; numc < mtable[row].length; numc++)
   System.out.print(mtable[row][numc] + "\t");
   System.out.println();
   }
   
   
   }
   
}