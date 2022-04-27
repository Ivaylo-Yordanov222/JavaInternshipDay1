import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        while(num != 0){
            int current = num % 10;
            num /= 10;
            result += current;
        }
        System.out.println(result);
    }
}