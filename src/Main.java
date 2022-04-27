import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] splitSentence = sentence.split(" ");
        int sum = 0;
        //System.out.println(splitSentence.length);
        for (int i = 0; i < splitSentence.length; i++)
        {
            sum += getDigitFromWord(splitSentence[i]);
        }
        System.out.println(sum);
    }
    public static int getDigitFromWord(String word)
    {
        int digit = 0;
        //int wholeNumber = 0;
        String num = "";
        for (int i = 0; i < word.length();i++)
        {
            if(Character.isDigit(word.charAt(i)))
            {
                num += word.charAt(i);
            }
        }
        if(num.length() != 0)
        {
            digit = Integer.parseInt(num);
        }
        return digit;
    }
}