public class StringUtils {

    public static boolean included(String word, String searched) {
        //check if empty
        if (word.isEmpty() || searched.isEmpty()) {
            return false;
        }

        //check if contain
        if (word.trim().toUpperCase().contains(searched.trim().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
