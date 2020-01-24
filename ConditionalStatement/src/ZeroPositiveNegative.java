import java.util.Scanner;

public class ZeroPositiveNegative {
    public static void main(String[]args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number  : ");
        double numberToCheck = scanner.nextDouble();

        if(numberToCheck > 0){ //if entered number is greater than zero then positive
            System.out.println("Entered number " + numberToCheck + "  is Positive");
        }
        else if(numberToCheck < 0){ //if entered number is lss than zero than negative
            System.out.println("Entered number " + numberToCheck + "  is Negative");
        }
        else {
            System.out.println("Entered number " + numberToCheck + "  is Zero ");
        }
    }
}
