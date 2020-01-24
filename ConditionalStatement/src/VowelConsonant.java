import java.util.Scanner;

public class VowelConsonant {
    public static void main (String [] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any alphabet : ");
        char character = scanner.next().charAt(0);

        // if character is from (A a E e I i O o U u) then vowel else consonant
        if (character=='a'|| character=='A'|| character=='E'||character=='e'
                ||character=='I'  ||character=='i'||  character=='O'||character=='o'||
                character=='U'||character=='u') {
            System.out.println("Input letter  " + "'" + character + "'" + " is " + "'" + "vowel" + "'");
        } else{
            System.out.println("Input letter " + "'"+character+"'" + " is "+ "'"+ "consonant" + "'");
        }
    }
}
