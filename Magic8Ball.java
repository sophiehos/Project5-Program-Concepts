//Sophia Hostetler
//U27264415
//Magic 8 Ball

import java.util.Random;
import java.util.Scanner;
public class Magic8Ball
{//start of program
   public static void main(String[] args)
   {//start of main

//The array in which a random one will be choosen to answer a question
String[] answers = {"It is certain.", "It is decidely so.", "Without a doubt.", "Yes-definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."};

//String variable
String str1;

   //intialization of 'generator' and 'soph'
   Random generator = new Random();
   Scanner Soph = new Scanner(System.in);
      
      //start of the do-while loop, will repeat if the while is true
      do       
      {
      //user input statement 
      System.out.print ("What is your question? ");
      String Question = Soph.nextLine();
      
      //chooses and index vcalue and then prints the index string
      int ans = generator.nextInt(answers.length);
      System.out.println (answers[ans]);

      /*prompts the user to submit ayes or no, in which anything other than yes 
        will result in the termination of the program*/
      System.out.println ("Would you like to ask another question? (Answer yes or no): ");
      str1 = Soph.nextLine();
      

      }/*repeat if true*/ while(str1.equalsIgnoreCase("yes"));//end of do-while loop

   }//end of main
}//end of program
   