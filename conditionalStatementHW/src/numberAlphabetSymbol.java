import java.util.Scanner;

public class numberAlphabetSymbol {
    public static void main(String [] args){
     Scanner scanner = new Scanner(System.in);
    System.out.print("Enter any alphabet , numbers or symbol : ");
    String character = scanner.next();

    //to check entered character is number or not
    if (character.matches("[0-9]") || character.matches("-[0-9]"))
    {
        System.out.println("Entered character is Number : ");
    }
    else if(character.matches("[a-z A-Z]")){ //checking entered character is alphabet or not

        System.out.print("Entered character is Alphabet : ");
    }
    else System.out.println("Entered character is special character");
}
}
