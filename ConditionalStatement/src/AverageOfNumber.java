import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number : ");  //enter first value
        double first = scanner.nextDouble();
        System.out.print("enter second number : ");  //enter second value
        double second = scanner.nextDouble();
        System.out.print("enter third number : "); //enter third value
        double third = scanner.nextDouble();
        System.out.print("enter fourth number : ");  //enter fourth value
        double fourth = scanner.nextDouble();
        System.out.print("enter fifth  number : ");  //enter fifth value
        double fifth= scanner.nextDouble();
        double average  = (first + second + third + fourth + fifth)/5 ;  //calculating average
        System.out.println("Average is : " + average);
    }
}
