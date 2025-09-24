import java.util.Scanner;
import java.util.regex.Pattern;

public class Task4 {
    public static String exec() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String result;


        //noinspection PointlessBooleanExpression
        if ((userInput.length() > 8 && userInput.length() < 12) == false) {
            result = "Incorrect length of password";
        } else if (!Pattern.compile("[A-Z]").matcher(userInput).find()){
            result = "Password lacks uppercase letters";
        } else if (!Pattern.compile("[a-z]").matcher(userInput).find()) {
            result = "Password lacks lowercase letters";
        } else if (!Pattern.compile("\\d").matcher(userInput).find()) {
            result = "Password lacks numerical digits";
        } else if (!Pattern.compile("[\"!,.;:'$#@%^&*<>/_|-]").matcher(userInput).find()) {
            result = "Password lacks special characters";
        } else {
            result = "All good!";
        }

        return result;
    }
}
