import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Калькулятор");

        Scanner scanner = new Scanner(System.in); // создаём объект для чтения ввода

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble(); // читаем число

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("Введите операцию + или /");
        String c = scanner.next();
        double result;
        Division div = new Division();
        Addition add = new Addition();


        if (c.equals("+")) {
            result = add.calculation(a, b);
        } else if (c.equals("/")) {
            result = div.calculation(a, b);
        } else {
            System.out.println("Неизвестная операция");
            return;
        }

        System.out.println("Результат: " + result);
    }
        }

