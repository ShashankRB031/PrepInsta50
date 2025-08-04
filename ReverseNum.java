import java.util.Scanner;

public class ReverseNum{
    public static void main(String[] args){
        System.out.print("Enter a number to reverse it : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int remainder = 0;
        int result = 0;
    
        while(num != 0){
            remainder = num % 10;
            result = result * 10 + remainder;
            num /= 10;

        }
        System.out.println("Reversed num is "+ result);
        sc.close();

    }
}