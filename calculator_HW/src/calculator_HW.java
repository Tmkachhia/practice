public class calculator_HW {

    //No return type WITH parameter static method
    public static void addition(int a, int b) {
        int c = a + b;                                  // Local variable declared inside method
        System.out.println("addition of " + a + " and " + b + " is = " + c);
    }

    // No return type wITH parameter Static method
    public static void subtraction(int a, int b) {
        int c = a - b;                                     // Local variable declared inside method
        System.out.println("subtraction of " + a + " and " + b + " is = " + c);
    }

    //  No return type WITH parameter Static method
    public static void multiplication(int a, int b) {
        int c = a * b;                                          // Local variable declared inside method
        System.out.println("multiplication of " + a + " and " + b + " is = " + c);
    }

    //  No return type WITH parameter Static method
    public static void division(int a, int b) {
        int c = a / b;                                 // Local variable declared inside method
        System.out.println("division of " + a + " and " + b + " is = " + c);
    }

    public static void main(String[] args) {
        addition(10, 20);
        subtraction(20, 5);
        multiplication(10, 5);
        division(20, 5);
    }


};