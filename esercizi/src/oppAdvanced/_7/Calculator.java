package oppAdvanced._7;

// You can change any code in this class if you think there is a bug!
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double power(double base, double exponent) {
        if (base == 0 && exponent == 0) {
            return 1.0;
        }

        return Math.pow(base, exponent);
    }
}

