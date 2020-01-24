import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number : ");
        int rollNumber = scanner.nextInt();  // Enter roll number
        System.out.println("Roll number is : " + rollNumber);

        System.out.print("Enter student name : ");
        String studentName = scanner.next();   //entering student name
        System.out.println("Student name is :" + studentName);

        System.out.print("Enter marks obtain in Maths : ");
        double mathsMark = scanner.nextDouble();   //enter student mark in maths
        System.out.println("Marks obtain in Maths " + mathsMark);

        System.out.print("Enter marks obtain in English : ");
        double englishMark = scanner.nextDouble();  //enter student mark in english
        System.out.println("Marks obtained in English : " +englishMark);

        System.out.print("Enter marks obtain in Science : "); //enter student mark in science
        double scienceMark = scanner.nextDouble();
        System.out.println("Marks obtain in Science : " + scienceMark);

        double totalMarks = mathsMark + englishMark + scienceMark;  //total of 3 subject
        System.out.println("Total marks obtain is : " + totalMarks);

        double percentage = totalMarks/300*100;                 //calculating  percentage
        System.out.println("Percentage is : " + percentage + " %");

        if(percentage>=80) {
            System.out.println("Grade : A+");   //if percentage >=80 print grade A+
        }
        else if(percentage >=60) {
            System.out.println("Grade : A");    //if percentage >=60 print grade A
        }
        else if( percentage >= 50 ) {
            System.out.print("Grade : B");   //if percentage >=50 print grade B
        }
        else if(percentage >= 35 ){

            System.out.println("Grade : C");    //if percentage >=35 print grade C
        }
        else {
            System.out.println("Fail");
        }
    }
}
