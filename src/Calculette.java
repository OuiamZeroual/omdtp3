public class Calculette {
    //addition
    public static int addition(int a, int b) {
        return a + b;
    }
    //soustraction
    public static int soustraction(int a, int b) {
        return a - b ;
    }
    //multiplication
    public static int multiplication(int a, int b) {
        return a * b;
    }
    //tests
    //division
    public static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("1 + 3 = " + addition(1,3));
    }

}