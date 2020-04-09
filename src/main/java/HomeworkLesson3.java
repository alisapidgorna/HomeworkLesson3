import java.util.Scanner;
public class HomeworkLesson3 {
    public static void main (String[]args){
        int y = 10;
        int k = 14;
        int n = 14;
        int f = 16;
        System.out.println("Matching of numbers:");
        if(f < n){
            System.out.println("f is less then n");
        }else if (n == f){
            System.out.println("n is not the same with f");
        }else if(n < f){
            System.out.println("n is less then f");
        }if((n = k) < y){
            System.out.println("y is bigger then n and k");
        }else if((n = k) > y){
            System.out.println("y is less then n and k");
        }if(n >= k){
            System.out.println("n is the same with k");
        }
        System.out.println("Two same numbers are: " + n + " and " + k);
        System.out.println();

        System.out.println("Mini Calculator");
        Scanner calculator = new Scanner(System.in);
        System.out.print("Please, enter two numbers: ");
        int firstNumber = calculator.nextInt();
        int secondNumber = calculator.nextInt();

        System.out.print("Please, enter one operator (+, -, *, /): ");
        char operator = calculator.next().charAt(0);
        int result;

        switch(operator){
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.printf("Operator is not correct");
                return;
        }
        System.out.printf("%1d %c %1d = %1d", firstNumber, operator, secondNumber, result);
    }
}