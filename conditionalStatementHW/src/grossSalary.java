import java.util.Scanner;

public class grossSalary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id : ");
        String employee_id = scanner.next();  //defining employee id

        System.out.print("Enter employee name : ");
        String employeeName = scanner.next();  //defining employee name

        System.out.print("Enter employee Basic Salary : ");
        double basicSalary = scanner.nextDouble(); //defining employee basicSalary

        double hra ;
        hra =( 0.10 * basicSalary );        // calculating House Rent Allowance for employee
        System.out.println("Employee HRA is : " + hra  );

        double da;
        da = ( 0.08 * basicSalary );             //calculating dearness Allowance of employee
        System.out.println("Employee DA is : " + da );

        double ta;
        ta = (0.09 * basicSalary );         //calculating travel Allowance of employee
        System.out.println("Employee TA is : " + ta );

        double pf ;
        pf = ( 0.2 * basicSalary);         //calculating PF of employee
        System.out.println("Employee PF is : " + pf);

        double grossSalary = (basicSalary+ hra + da + ta - pf) ;
        System.out.println("Employee gross salary is  : " + grossSalary);
    }
}
