import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0)
        {
            System.out.println(0);
        }
        else{
            for (int i = 1; i <= n; i++)
            {
                if(n%i == 0)
                {
                    System.out.print(i + " ");
                }
            }
        }

    }
}