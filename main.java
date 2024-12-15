import java.util.*;
class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();
        System.out.println("Enter operation u wanna do");
        char op = scan.next().charAt(0);

        scan.close();

        switch (op) {
            case '+':
                sum = num1 + num2;
                break;
            case '-':
                sum = num1 - num2;
                break;
            case '*':
                sum = num1 * num2;
                break;
            case '%':
                sum = num1 % num2;
                break;
            case '/':
                sum = num1 / num2;
                break;
            default:
                System.out.println("Choose correct operator");
                break;
        }

        System.out.println(num1+" "+op+" "+num2+" = "+sum);

    }
}