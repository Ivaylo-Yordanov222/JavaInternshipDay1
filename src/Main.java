import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int crown = n - 2;
        int stem = n - crown;
        int numOfSpaces = n-1;
        drawTree(numOfSpaces,crown);
        drawTree(numOfSpaces,stem);
    }
    public static void drawTree(int spaces, int size){
        int columns = 0;
        for(int i = 0; i < size; i++)
        {
            columns = 2*i+1;
            for(int j = 1; j <= spaces+columns; j++)
            {
                if(j <= spaces)
                    System.out.print(' ');
                else
                    System.out.print('*');
            }
            System.out.println();
            spaces--;
        }
    }
}