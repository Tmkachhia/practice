public class Addition {
  static Addition addition = new Addition();
    int a = 5 ;
    String name = "Tarjani";
    static String  city = "London";

    public void m1(){
        System.out.println(a);
        System.out.println(city);
    }

    public static void add(){
        System.out.println(addition.a);

    }
    public static void main(String[] args){

        System.out.println(addition.a);
        System.out.println(addition.name);
       addition.m1();;
        add();
    }
}
