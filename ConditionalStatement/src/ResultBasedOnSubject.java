import java.util.Scanner;

public class ResultBasedOnSubject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number : ");
        int rollNumber = scanner.nextInt();         //variable for rool number
        System.out.println("Roll number is : " + rollNumber);

        System.out.print("Enter student name : ");
        String studentName = scanner.next();   //variable declared for student name
        System.out.println("Student name is :" + studentName);

        System.out.print("Enter marks obtain in Maths : ");
        float mathsMark = scanner.nextFloat();      //variable for maths mark
        System.out.println("Marks obtain  in Maths is : " + mathsMark);

        System.out.print("Enter marks obtain in Science : ");
        float scienceMark = scanner.nextFloat();        // variable for science marks
        System.out.println("Marks obtain  in Science is : " + scienceMark);

        System.out.print("Enter marks obtain in English : ");
        float englishMark = scanner.nextFloat();            // variable for english mark
        System.out.println("Marks obtain  in English is : " + englishMark);

        float totalMarks = (mathsMark + englishMark + scienceMark);  //calculating total of 3 subject
        float percentage = totalMarks / 300 * 100;      //calculating percentage
        //student must be pass in all 3 subject else fail
        if ((mathsMark >= 35) && (englishMark >= 35) && (scienceMark >= 35)) {
            System.out.println("pass");
            System.out.println("Total marks is : "+ totalMarks);
            System.out.println("percentage is : " + percentage);
            if (percentage >= 80) {
                System.out.println("Grade = A+");  //if percentage >=80 print grade A+
            } else if (percentage >= 60) {
                System.out.println("Grade = A ");  //if percentage >=60 print grade A
            } else if (percentage >= 50) {
                System.out.println("Grade = B ");  //if percentage >=50 print grade B
            } else if (percentage >= 35) {
                System.out.println("Grade = C");  //if percentage >=35 print grade C
            }

        }else {
            System.out.println("'"+"Fail"+"'");
            System.out.println("Better luck next time");
        }
    }
}
