public class SimpleCalculator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        add adddata=new add();
        int result=adddata.add(a,b);

        System.out.println("Addition: " + result);
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }


}