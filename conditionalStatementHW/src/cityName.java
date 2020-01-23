import java.util.Scanner;

public class cityName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter alphabet : ");

        char cityName = scanner.next().charAt(0);
        switch(cityName)
        {
            case 'a' :
                System.out.println("Ahmedabad");
                break;
            case 'b' :
                System.out.println("Baroda");
                break;
            case 'c' :
                System.out.println("calcutta");
                break;
            case 'd' :
                System.out.println("Delhi");
                break;
            case 'e' :
                System.out.println("Ellora");
                break;
            case 'f' :
                System.out.println("Fatehpur");
                break;
        }
    }
}
