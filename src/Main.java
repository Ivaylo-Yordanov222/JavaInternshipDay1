import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int m;
        for (int i = 0; i< n;i++)
        {
            m = sc.nextInt();
            numbers[i] = m;
        }
        for (int j = numbers.length -1 ; j >= 0; j--)
        {
            System.out.print(numbers[j] + " ");
        }
    }
}