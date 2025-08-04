import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num, firstNum = 0, secondNum = 1, nextNum;

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        System.out.print("Fibonacci Series up to " + num + " terms: ");

        for (int i = 1; i <= num; i++) {
            System.out.print(firstNum + " ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

        sc.close(); 
    }
}
