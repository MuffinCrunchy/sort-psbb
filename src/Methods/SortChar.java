package Methods;

import java.util.ArrayList;
import java.util.List;

public class SortChar {

    public static List<String> sortChar(String str) {
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        str = str.toLowerCase().replace(" ", "");
        String vowChar = "";
        String consonChar = "";
        while (!str.isEmpty()) {
            char currChar = str.charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == currChar) {
                    if (vowels.contains(String.valueOf(currChar))) {
                        vowChar += str.charAt(i);
                    } else {
                        consonChar += str.charAt(i);
                    }
                }
            }
            str = str.replace(String.valueOf(currChar), "");
        }
        return new ArrayList<>(List.of(vowChar, consonChar));
    }
}
