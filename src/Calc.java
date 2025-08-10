public class Calc {
    static double add(double a, double b) {
        return a + b;
    }

static double division(double a, double b) {
    if (b == 0) {
        System.out.println("Деление на ноль");
        return Double.NaN;
    }
    return a / b;
}
}

