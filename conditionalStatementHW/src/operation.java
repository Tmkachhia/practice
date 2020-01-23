import java.util.Scanner;

public class operation {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value : "); // entering first value
        double firstValue = scanner.nextDouble();

        System.out.print("Enter second value : ");
        double secondValue = scanner.nextDouble(); //defining second variable

        System.out.print("Enter any operator from ( + , - , * , / ) : ");
        char operator = scanner.next().charAt(0);    //defining variable for  special character

        switch (operator) {
            case '+' :
                System.out.println("Addition is " + (firstValue + secondValue)); //adding two variable
                break;
            case '-' :
                System.out.println("Subtraction  is " + (firstValue  - secondValue)); //subtracting two variable
                break;
            case '*' :
                System.out.println("Multiplication  is " + (firstValue * secondValue)); //multiplying two variable
                break;
            case '/' :
                System.out.println("division is " + (firstValue / secondValue)); //dividing two variable
                break;
            default:
                System.out.println("You have entered wrong operator");
        }

    }
}
