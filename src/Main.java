import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char star = '*';
        char space = ' ';

        for (int i = 1; i <= n; i++)
        {
            for(int j = n; j > 0; j--)
            {
                if(i == 1 || i == n)
                {
                    System.out.print(star);
                }
                else{
                    if(j == i)
                    {
                        System.out.print(star);
                    }
                    else{
                        System.out.print(space);
                    }
                }
            }
            System.out.println();
        }
    }
}