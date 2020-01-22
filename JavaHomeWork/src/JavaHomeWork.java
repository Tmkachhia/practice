public class JavaHomeWork {

        // Find middle character of string
        //will call this method in main method
    public static void middleCharacter(String s8){
        int stringLength = s8.length();         // Length of String
        int stringModule = stringLength % 2;      // module of string , if 1 then string length is odd
                                                    //  and if module is 0 then string length is even

        if (stringModule == 1) {
            System.out.println( "length of string "+s8 + " is odd"); //check length of character odd/even
            int middleCharacterFrom = stringLength / 2;          //  character start from  (inclusive)
            int middleCharacterTo = stringLength / 2 + 1;       //character end to (exclusive)
            System.out.println("middle character is "+ "'" + s8.substring(middleCharacterFrom, middleCharacterTo) +"'");
        }else {
            System.out.println("length of string "+s8 + " is even");
            int middleCharacterFrom = stringLength/2-1;         // character start from  (inclusive)
            int middleCharacterTo =  stringLength/2+1;          // //character end to (exclusive)
            System.out.println("middle characters are "+"'"+ s8.substring(middleCharacterFrom, middleCharacterTo)+"'");
        }
    }


    public static void main(String[] args) {

        String s1 = "This is very easy programme";

        // 1) removing all occurrence of s
        String removeS = s1.replace("s", "");       //removing 's' with empty string
        System.out.println("1) " + removeS);

        // 2) length of string
        System.out.println("2) " + "string length is " + s1.length()); //finding length of string

        // 3) remove spaces from string
        String noSpaceString = s1.replaceAll("\\s", ""); //removing spaces
        System.out.println("3) " + noSpaceString);

        // 4) extract special   character

        String s2 = "This $300 is equivalent of £200 but not for @100";
        //first replace all numbers and character in empty spaces and removing all spaces
        String ExtractSpecialCharacter = s2.replaceAll("[A-za-z0-9]", "").replaceAll("\\s+", "");
        System.out.println("4) " + ExtractSpecialCharacter);


        // 5) extract number from string
        String s3 = " The cost of iPhone is £1,250";
        String ExtractNumber = s3.replaceAll("[^0-9]", ""); //replacing non numbers with empty string
        System.out.println("5) " + ExtractNumber);

        //6) convert integer to double
        int i = 450;
        double d1 = i;   // converting int to double
        System.out.println("6) " + d1);

        // 7) convert string to integer
        String s4 = "125";
        int stringToInteger = Integer.parseInt("125");  // convert string to int
        System.out.println("7) " + stringToInteger);

        // 8) convert double to string
        double d2 = 123.45;
        String doubleToString = Double.toString(123.45);  //convert double to string
        System.out.println("8) " + doubleToString);

        // 9) convert string to double
        String s5 = "560.25";
        double stringToDouble = Double.parseDouble("560.25"); //convert string to double
        System.out.println("9) " + stringToDouble);

        // 10) Answer of 1/3 in decimal
        int i2 = 1 / 3;
        double d3 = (double) 1 / 3;  //convert fraction to double
        System.out.println("10) " + d3);

        // 11) replace $ to £
        String s6 = "$250.00";
        String s7 = s6.replace("$", "£"); //Replacing $ to £
        System.out.println("11) " + s7);

        // calling method middleCharacter to print middle character of string

        middleCharacter( "orange");
        middleCharacter("there");
        middleCharacter("England");
        middleCharacter ("elephant");

    }
}
