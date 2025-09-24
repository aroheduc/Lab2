import java.util.Scanner;

public class Task5 {
    public static int exec() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Scanner stringScanner = new Scanner(userInput);
        int result = 0;


        while (stringScanner.hasNext()) {
            result += stringScanner.useDelimiter("\\D+").nextInt();
        }
        stringScanner.close();
        return result;
    }
}

