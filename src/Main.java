//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        System.out.println("Калькулятор");
        double a = 5;
        double b = 0;
//        Calc w = new Calc();
        System.out.println(a + " / " + b + " = "+ Calc.division(a,b));
        System.out.println(a + " + " + b + " = "+ Calc.add(a,b));
    }


}