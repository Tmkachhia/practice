import java.util.Scanner;

public class EvenOddNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your number here : ");  //user can add number
            int numberToCheck = scanner.nextInt();  //using scanner class for input of variable

            // Using ternary operator to find number is even or odd

            String evenOdd = (numberToCheck % 2 == 0) ? "even" : "odd"; //ternary operator to check number is odd/even
            System.out.print("Entered number " + numberToCheck + " is " + evenOdd);
        }
    }