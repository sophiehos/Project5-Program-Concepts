//Sophia Hostetler
//U27264415
//Less than the limit

import java.util.Scanner;
public class LessThanTheLimit
{
   public static void DetermineLimit (int lim, int value)
  
   {
      if (value < lim)
      {
      System.out.print(value + " ");
      }
   }
   public static void main(String[] args)
   { 
   Scanner input = new Scanner (System.in);
   int [] num = new int [10];
   int i;
   System.out.println ("Please enter 10 numbers: ");
   
   for (i = 0; i < num.length; i++)
   {
      num[i] = input.nextInt();
   }   
   System.out.print ("Please enter a limit: ");
   int lim = input.nextInt();
   System.out.print ("These Values are less than the limit " + lim + ": ");
   for (i = 0; i < num.length; i++)
   {
   DetermineLimit (lim, num[i]);
   }
   
   
   }
}
   
   
   
   
   
   
   
   
