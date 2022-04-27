import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] splitSentence = sentence.split("");

        String[] vowels = {"a","e","o","y","i","u","A","E","O","Y","I","U"};
        StringBuilder resultSentence = new StringBuilder();
        for(int i = 0; i < splitSentence.length; i++){
            boolean isVowel = checkLetter(splitSentence[i], vowels);
            if(!isVowel)
            {
                resultSentence.append(splitSentence[i]);
            }
        }
        System.out.println(resultSentence.toString());
    }
    public static boolean checkLetter(String letter, String[] sequence)
    {
        for(int i = 0; i<sequence.length; i++)
        {
            if(letter.equals(sequence[i]))
            {
                return true;
            }
        }
        return false;
    }
}