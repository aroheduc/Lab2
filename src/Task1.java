import java.util.Scanner;

public class Task1 {
    public static StringBuilder exec() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        StringBuilder output = new StringBuilder(); //Использую StringBuilder, чтобы не было проблем с памятью

        for (int i = 0; i < userInput.length(); i++){
           if (Character.isLowerCase(userInput.charAt(i))){
               output.append(userInput.charAt(i));
           }
        }

        return output;
    }
}
