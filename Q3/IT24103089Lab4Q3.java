import java.util.Scanner;
public class IT24103089Lab4Q3 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int number = input.nextInt();
      String state = ( number < 0) ? "Negative" : ( number > 0) ? "Positive" : "Zero" ;
            
      System.out.println("The number is: "+ state);
      
   }
}