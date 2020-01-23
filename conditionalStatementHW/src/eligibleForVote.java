import java.util.Scanner;

public class eligibleForVote {
 public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age : ");

    int age = scanner.nextInt();
    if (age >= 18) {  // checking age >=18 than  eligible
        System.out.println("The person is eligible to vote");
    }else {
        System.out.println("The person is not eligible to vote");
    }
}
}
