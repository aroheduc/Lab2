import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7 {
    public static int exec() {
        Scanner scanner = new Scanner(System.in);
        String exampleString = "Yo! You're a ��� too, right? Have you ever thought about a world where everything is exactly the same... Except you don't exist? Everything functions perfectly without you... Ha, ha... The thought terrifies me. An umbrella...? But it's not raining. Ha, ha... You know, that does make me feel a little better about this. Thank you. Please forget about me. Please don't think about this anymore.";
        Scanner stringScanner = new Scanner(exampleString);
        String tempString;
        int price = 0;

        while (stringScanner.hasNext()) {
            tempString = stringScanner.useDelimiter("\\.+|!+|\\?+|\\s+|(\\b\\w{1,2}\\b)").next();
            if (Pattern.compile("A-z").matcher(tempString).find()){
                price += 10;
            }
            if (Pattern.compile(",").matcher(tempString).find()){
                tempString = tempString.replace(",", "COMMA");
                price += 10;
            }
            System.out.print(tempString);
        }

        stringScanner.close();
        scanner.close();
        return price;
    }
}