package by.bsu.kmp.utl;


import by.bsu.kmp.entity.TextHolder;

/**
 * Created by anyab on 15.05.2017.
 */
public class AlgorithmUtil {
    private static final int NOT_FOUND = 0;

    public static int[] calculateFailure(String substring){
        int[] failure = new int[substring.length()];
        for (int i = 1; i < substring.length(); i++) {
            int j = failure[i - 1];
            while (j > 0 && substring.charAt(i) != substring.charAt(j))
                j = failure[j - 1];
            if (substring.charAt(i) == substring.charAt(j))
                j++;
            failure[i] = j;
        }
        return failure;
    }


    public static int search(TextHolder textHolder) {
        int textLength = textHolder.getText().length();
        int substrLength = textHolder.getSubstring().length();
        String text = textHolder.getText();
        String substr = textHolder.getSubstring();
        int j = NOT_FOUND;
        for (int i = 0; i < textLength; i++) {
            while (j > NOT_FOUND && text.charAt(i) != substr.charAt(j)) {
                j = textHolder.getFailure()[j -1];
            }
            if (text.charAt(i) == substr.charAt(j)) {
                j++;
                if (j == substrLength) {
                    return i - (j + 1);
                }
            }
        }
        return NOT_FOUND;
    }
}
