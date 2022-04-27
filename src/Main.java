import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squareSide = scanner.nextInt();
        char star = '*';
        char space = ' ';

        for (int i = 1; i <= squareSide; i++)
        {
            for(int j = 1; j <= squareSide; j++)
            {
                if(i == 1 || i == squareSide)
                {
                    if(j != squareSide)
                    {
                        System.out.print(star);
                        System.out.print(space);
                    }
                    else {
                        System.out.print(star);
                    }
                }
                else{
                    if(j == 1)
                    {
                        System.out.print(star);
                        System.out.print(space);
                    }
                    else if(j == squareSide)
                    {

                        System.out.print(star);
                    }
                    else{

                        System.out.print(space);
                        System.out.print(space);
                    }
                }
            }
            System.out.println();
        }
    }
}