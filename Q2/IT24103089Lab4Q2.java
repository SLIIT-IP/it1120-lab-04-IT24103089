import java.util.Scanner;
public class IT24103089Lab4Q2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter exam marks: ");
      double exammarks = input.nextDouble();
      if (exammarks > 100 || exammarks < 0 ) {
          System.out.println("Invalid input. Terminating program."); return;
      }

      System.out.println("Please enter lab submission marks: ");
      double labmarks = input.nextDouble();
      if (labmarks > 100 || labmarks < 0 ) {
          System.out.println("Invalid input. Terminating program."); return;
      }
      
      System.out.println("Please enter percentage for the exam: ");
      double exampercentage = input.nextDouble();

      System.out.println("Please enter percentage for lab submission: ");
      double labpercentage = input.nextDouble();    

      if ( exampercentage + labpercentage  != 100 ) {
          System.out.println("The percentages must add up to 100. Terminating program."); return;
      }
  

      double finalmark = ( exammarks * exampercentage / 100) + ( labmarks * labpercentage / 100 );       
      
      System.out.println("Final Exam Mark is: "+ finalmark );
      
   }
}