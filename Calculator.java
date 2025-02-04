import java.util.Scanner;

public class Calculator {
    public static int Add(int a, int b) {
        return a + b;
    }
    public static int Subtract(int a, int b) {
        return a - b;
    }
    public static int Divide(int a, int b) {
        return a / b;
    }
    public static int Multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int a, b, result;
        String choice;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your chosen operation? \n 1.) Add \n 2.) Subtract \n 3.) Divide \n 4.) Multiply");
        choice = input.next();
        if (choice.equalsIgnoreCase("Add")){
            System.out.println("You chose add.\nWhat is your first number?");
            a = input.nextInt();

            System.out.println("What is your second number?");
            b = input.nextInt();

            result = Add(a, b);
            System.out.println("The answer is: " + result);
        }
        if (choice.equalsIgnoreCase("Subtract")) {
            System.out.println("You chose subtract.\nWhat is your first number?");
            a = input.nextInt();

            System.out.println("What is your second number?");
            b = input.nextInt();

            result = Subtract(a, b);
            System.out.println("The answer is: " + result);
        }
        if (choice.equalsIgnoreCase("Divide")) {
            System.out.println("You chose divide.\nWhat is your first number?");
            a = input.nextInt();

            System.out.println("What is your second number?");
            b = input.nextInt();

            result = Divide(a, b);
            System.out.println("The answer is: " + result);
        }
        if (choice.equalsIgnoreCase("Multiply")) {
            System.out.println("You chose multiply.\nWhat is your first number?");
            a = input.nextInt();

            System.out.println("What is your second number?");
            b = input.nextInt();

            result = Multiply(a, b);
            System.out.println("The answer is: " + result);
        }
    }
}