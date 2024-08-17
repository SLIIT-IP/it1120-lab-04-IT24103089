import java.util.Scanner;
public class IT24103089Lab4Q1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int number = input.nextInt();
      String state = input.nextLine();
      if (number < 0) {
         state = "Negative" ;
      }
      if (number > 0) {
         state = "Positive" ;
      }
      if (number == 0) {
         state = "Zero" ;
      }
           
      
      System.out.println("The number is: "+ state);
      
   }
}