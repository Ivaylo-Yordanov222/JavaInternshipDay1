import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] splitSentence = sentence.split(" ");
        int currentNumberOfWords = 0;
        //System.out.println(splitSentence.length);
        for (int i = 0; i < splitSentence.length; i++)
        {
            boolean isCorrectWord = isTheWordCorrect(splitSentence[i]);
            if(isCorrectWord)
            {
                currentNumberOfWords++;
            }
        }
        System.out.println(currentNumberOfWords);
    }
    public static boolean isTheWordCorrect(String word)
    {
        boolean iscorrectLetter = false;
        boolean iscorrectWord = true;
        for (int i = 0; i < word.length();i++)
        {
            char currentLetter = word.charAt(i);
            if((currentLetter >= 96 && currentLetter <=122)
                    || (currentLetter >= 65 && currentLetter <=90)
                    || currentLetter == '.'
                    || currentLetter=='`'
                    || currentLetter == '?'
                    || currentLetter == '!'
                    || currentLetter == '\''
                    || currentLetter == '’')
            {
                iscorrectLetter = true;
            }
            else {
                iscorrectLetter = false;
                iscorrectWord = false;
                break;
            }
        }
        return iscorrectWord;
    }
}