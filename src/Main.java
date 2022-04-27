import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int n = sc.nextInt();
        //int[] numbers = new int[n];
        int m;
        int sum = 0;
        for (int i = 0; i< n;i++)
        {
            m = sc.nextInt();
            //numbers[i] = m;
            sum += m;
        }
        System.out.println(sum);
    }
}