import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        while (num != 0) {

            int digit = num % 10;
            result = (result * 10) + digit;
            num /= 10;
        }
        System.out.println(result);
    }
}