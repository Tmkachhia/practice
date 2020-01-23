import java.util.Scanner;

public class leapYear {
    public static void main(String[]args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");  //enter year to check leap year or not
        int year = scanner.nextInt();
        System.out.println("Entered year is " + year );

        if( year % 4 ==0 && year % 100 != 0)  //if year is divisible by 4 but not 100 then  leap year
        {
            System.out.print("Entered year is "+ year+ " leap year");
        }
        //number is divisible by 4 ,100 and 400 then only leap year
        else if (year % 4 ==0 && year %100 ==0 && year % 400 ==0 )
        {
            System.out.print("Entered year is "+ year+ " leap year");
        }
        else{
            System.out.print("Entered year is "+ year+ " not a leap year");
        }
    }
}
