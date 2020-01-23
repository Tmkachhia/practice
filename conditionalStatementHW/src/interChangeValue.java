import java.util.Scanner;

public class interChangeValue {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print number a : ");
        int a = scanner.nextInt();
        System.out.println("number a is " + a );

        System.out.print("Print number b = ");
        int b= scanner.nextInt();
        System.out.println("number b is " + b );

        // if a = 5 and b = 4
        a = a + b ;  //a = 9
        b = a - b ; // now b = 9-4 = 5 ,now b =5
        a = a - b ; // a = 9-5 =4, so a = 4
        System.out.println("Now a is "+ a + " b is "+ b);
    }
}
