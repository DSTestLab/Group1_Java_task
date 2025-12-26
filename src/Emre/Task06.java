package Emre;

public class Task06 {

    public static String removeDup(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
//done

    }

}
