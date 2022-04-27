import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = false;
        int n = sc.nextInt();
        if(n == 2 || n == 3)
        {
            isPrime = true;
        }
        else if(n % 2== 0 || n % 3==0)
        {
            isPrime = false;
        }
        else{
            isPrime = true;
        }
        System.out.println(isPrime);
    }
}