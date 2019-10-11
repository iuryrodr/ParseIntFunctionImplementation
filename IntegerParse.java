/**
 * Created by Ashwin on 2/4/17.
 */
public class IntegerParse {
    public static void parseInteger(String string) {
        if(string.length() == 0 || !string.matches("\\d+")) {
            System.out.println("Invalid String");
            return;
        }

        System.out.println(string.substring(0));
    }

    public static void main(String a[]) {
        value = parseInteger("239");
        int number = parseInt(value);
        System.out.println(number);
    }
}
