import java.util.Scanner;

public class salesCommission {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sales id : ");
        String salesId = scanner.next();      //defining sales id variable

        System.out.print("Enter seller's name : ");
        String sellersName = scanner.next();           //defining name variable

        System.out.print("Enter salary basic : ");
        double SalaryBasic = scanner.nextDouble();  //defining salaryBasic variable

        System.out.print("Enter sales amount : ");
        Double salesAmount = scanner.nextDouble();  //defining salesAmount variable


        if (salesAmount >= 50000)
        {
            System.out.print("Sales commission is : " + 0.35 *salesAmount );
        }
        else if(salesAmount>=30000)
        {
            System.out.print("sales commission is : " + 0.20 * salesAmount );
        }
        else if(salesAmount>=20000){
            System.out.print("sales commission is : " + 0.10 * salesAmount);
        }

        else if(salesAmount>=10000) {
            System.out.print("sales commission is : " + 0.05 * salesAmount);
        }
        else {
            System.out.print("sales commission is : " + 0.02 * salesAmount);
        }
    }
}
