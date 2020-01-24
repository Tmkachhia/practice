import java.util.Scanner;

public class UpperToLowerCase { public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter any alphabet in uppercase : ");
    char UPPER= scanner.next().charAt(0);

    //  converting character to lowercase

    char converted_Character= Character.toLowerCase(UPPER);
    System.out.println("Converted character to lowercase is "+ "'"+ converted_Character+"'" );
}
}
