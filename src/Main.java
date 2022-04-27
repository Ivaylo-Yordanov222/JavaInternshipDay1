import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringBuilder formattedText = new StringBuilder();
        for (int i = 0; i < text.length();i++){
            formattedText.append(text.charAt(i));
            if(text.charAt(i) == '!' || text.charAt(i) == '.' || text.charAt(i) == '?')
            {
                formattedText.append('\n');
            }
        }
        System.out.println(formattedText.toString());
    }
}