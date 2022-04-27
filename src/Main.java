import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Type sequence of whole "+ n + " numbers separated with space:");
        String m = sc.nextLine();
        int[] numbers = getIntArray(m);
        if(numbers.length == n)
        {
            for (int i = 0; i<numbers.length;i++)
            {
                if(numbers[i] % 2 == 0)
                {
                    System.out.print(numbers[i] + " ");
                }
            }
        }
    }
    static int[] getIntArray(String str)
    {
        String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }
}