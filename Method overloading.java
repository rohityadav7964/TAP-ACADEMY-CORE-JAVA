public class Calculator {

    // Add method for two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add method for three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Add method for two floats
    public float add(float a, float b) {
        return a + b;
    }

    // Add method for one integer and one double
    public double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call and print results of overloaded methods
        System.out.println("Sum of two integers: " + calc.add(10, 5));
        System.out.println("Sum of three doubles: " + calc.add(4.5, 3.0, 6.0));
        System.out.println("Sum of two floats: " + calc.add(2.5f, 3.5f));
        System.out.println("Sum of an integer and a double: " + calc.add(7, 4.5));
    }
}
