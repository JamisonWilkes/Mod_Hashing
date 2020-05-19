import javax.swing.*;
import java.util.Scanner;

public class program2ModHashing
{
public static void main(String args[])
{
   int runningtotal = 0;
   boolean run = true;
   
   while(run)
   {
      Scanner xyz = new Scanner(System.in);
      System.out.println("Please enter the sentence that you would like hashed");
      System.out.println("Continue to input sentences/words: enter -1 if you would like to quit");
      String sentence = xyz.nextLine();
       //System.out.println(sentence);
      String noSpaces = sentence.replaceAll("\\s", "");
      String userSentence = noSpaces.toLowerCase();
      if(userSentence.contains("-1"))
         {
         run = false;
         break;
         }
      else 
      for(int i = 0; i < userSentence.length(); i++)
       {
         runningtotal += userSentence.charAt(i) - 96;
       
       }
       //System.out.println(noSpaces);
       System.out.println(runningtotal % 31);
       runningtotal = 0;     
    }  
}
}
