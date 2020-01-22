public class staticPractice {
    public static void main(String[] args){

        String S1 = "This is very easy programme";
        String removeS = S1.replaceAll("s","") ;
         System.out.println(removeS);

         int lengthS1 = S1.length();
        System.out.println(lengthS1);

        String removeSpaceS1 = S1.replaceAll("\\s" ,"");
        System.out.println(removeSpaceS1);

        String S2= "This $300 is equivalent of £200 but not for @100";
        String specialCharacter = S2.replaceAll("[0-9A-Z,a-z]","").replaceAll("\\s","");
        System.out.println(specialCharacter);

       String S3 = "The cost of iPhone is £1,250";
       String extractNumber = S3.replaceAll("[^0-9]","");
        System.out.println(extractNumber);

        int i = 450;
        double d1 = i ;
        System.out.println(d1);

        String S4 = "125";
        int stringToInt = Integer.parseInt("125");
        System.out.println(stringToInt);

        Double d2 = 123.45;
        String doubleToString = Double.toString(123.45);
        System.out.println(doubleToString);

        String S5 = "560.25 ";
        Double d3 = Double.parseDouble("560.25");
        System.out.println(d3);

        int i2 = 1/3;
        Double d4 =( double)1/3;
        System.out.println(d4);

        String s5 = "$250.00";
        String convertto£ = s5.replace("$","£");
        System.out.println(convertto£);





                  }

}







