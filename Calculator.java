package java8;

public class Calculator {

    public static void main(String[] args) {

        //Addition
        CalculatorInterface additionInterface = (int n1, int n2) -> n1 + n2;
        System.out.println("Addition is : " + additionInterface.calc(10, 5));


        //Multiplication
        CalculatorInterface mulInterface = (n1, n2) -> n1 * n2;
        System.out.println("Multiplication is : " + mulInterface.calc(10, 5));

        //Substraction
        CalculatorInterface subInterface = (n1, n2) -> n1 - n2;
        System.out.println("Substaction is : " + subInterface.calc(10, 5));

        //Division
        CalculatorInterface divInterface = (n1, n2) -> n1 / n2;
        System.out.println("Division is : " + divInterface.calc(10, 5));

    }
}

@FunctionalInterface
interface CalculatorInterface {
    int calc(int a, int b);
}