import java.util.Scanner;

public class Task6 {
    public static String exec() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String exampleString = "Yo! You're a ��� too, right? Have you ever thought about a world where everything is exactly the same... Except you don't exist? Everything functions perfectly without you... Ha, ha... The thought terrifies me. An umbrella...? But it's not raining. Ha, ha... You know, that does make me feel a little better about this. Thank you. Please forget about me. Please don't think about this anymore.";
        Scanner stringScanner = new Scanner(exampleString);
        StringBuilder result = new StringBuilder();
        String tempString;

        while (stringScanner.hasNext()) {
            tempString = stringScanner.useDelimiter("\\.+|!+|\\?+").next();
            if (tempString.matches(".*\\b"+ userInput +"\\b.*")){
                result.append(tempString);
            }
        }
        stringScanner.close();
        scanner.close();
        return result.toString();
    }
}
