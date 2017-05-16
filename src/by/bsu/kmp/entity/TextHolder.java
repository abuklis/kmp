package by.bsu.kmp.entity;

import by.bsu.kmp.utl.AlgorithmUtil;

/**
 * Created by anyab on 15.05.2017.
 */
public class TextHolder {
    private int[] failure;
    private String text;
    private String substring;

    public TextHolder(String text, String substring) {
        this.substring = substring;
        this.text = text;
        failure = AlgorithmUtil.calculateFailure(substring);
    }

    public int[] getFailure() {
        return failure;
    }

    public void setFailure(int[] failure) {
        this.failure = failure;
    }

    public String getSubstring() {
        return substring;
    }

    public void setSubstring(String substring) {
        this.substring = substring;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
