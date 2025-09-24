import java.util.Scanner;

public class Task3 {
    public static int exec() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Scanner stringScanner = new Scanner(userInput);
        int wordCounter = 0;

        for (int i = 0; i < userInput.length();){
            String tempString = stringScanner.useDelimiter(", ").next();
            if (tempString.length() == 3){
                wordCounter++;
            }
            i += tempString.length() + 2;
        }

        stringScanner.close();

        return wordCounter;

    }
}