import java.util.Scanner;
/**
 * Tells the player if their number is a Fizz, Buzz or a FizzBuzz word
 * @author Thomas Quigley
 */
public class Main {

  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask for their number and store input
    System.out.println("Please enter a number to play FizzBuzz");
    int userNumber = input.nextInt();

    // figure out if you can divide by 5, or 3
    int remainder5 = userNumber % 5;
    int remainder3 = userNumber % 3;

    /* tell them if their number is a Fizz, Buzz or FizzBuzz
    * if the remainder5 is 0 then the number is a multiple of 5. 
    * if the remainder3  is 0 then the number is a multiple of 3
    */
    if (userNumber == 0) {
      System.out.println("You should say " + userNumber);
    } else if (remainder5 == 0 && remainder3 == 0){ 
      System.out.println("You should say FizzBuzz");
    } else if (remainder5 == 0) {
      System.out.println("You should say Buzz");
    } else if (remainder3 == 0) {
      System.out.println("You should say Fizz");
    } else {
      System.out.println("You should say " + userNumber);
    }
  }
}
