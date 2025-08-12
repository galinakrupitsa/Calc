public class Division implements Calculation {
    @Override
    public double calculation(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на ноль");
            return Double.NaN;
        }
        return a / b;
    }
    }
