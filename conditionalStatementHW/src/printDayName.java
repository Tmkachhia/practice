import java.util.Scanner;

public class printDayName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number between 1 to 7 : ");
        int number = scanner.nextInt(); //defining variable

        switch(number) {
            case 1 :
                System.out.println(" output is : Monday");
                break;
            case 2 :
                System.out.println("output is : Tuesday");
                break;
            case 3 :
                System.out.println("output is : Wednesday");
                break;
            case 4 :
                System.out.println("output is : Thursday");
                break;
            case 5 :
                System.out.println("output is : Friday");
                break;
            case 6 :
                System.out.println("output is : Saturday");
                break;
            case 7 :
                System.out.println("output is : Sunday");
                break;

            default:
                System.out.println("Entered wrong number");
        }
    }
}
