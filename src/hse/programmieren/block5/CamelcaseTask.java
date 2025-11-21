package hse.programmieren.block5;

public class CamelcaseTask {

    static void main() {

        System.out.println(palinGenOneline("lager"));
    }

    static String palinGenOneline(String input) {
        return input.length() == 1 ? "" + input.charAt(0) : input.charAt(0) + palinGenOneline(input.substring(1)) + input.charAt(0);
    }

    static String lowerCaseString(String value) {
        return "";
    }

    static String upperCaseString(String value) {
        return "";
    }
}
