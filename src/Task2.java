import java.util.Scanner;

public class Task2 {
    public static StringBuilder exec() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        StringBuilder output = new StringBuilder(); //Использую StringBuilder, чтобы не было проблем с памятью

        for (int i = userInput.length() - 1; i > -1; i--){
            output.append(userInput.charAt(i));
        }

        return output;
    }
}
