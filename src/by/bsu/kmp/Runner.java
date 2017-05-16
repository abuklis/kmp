package by.bsu.kmp;

import by.bsu.kmp.entity.TextHolder;
import by.bsu.kmp.utl.AlgorithmUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by anyab on 15.05.2017.
 */
public class Runner {
    private static final String FILE_NAME = "text.txt";

    public static void main(String[] args) {
        StringBuilder resultText = new StringBuilder();
        try {
            Scanner in = new Scanner(new FileReader(FILE_NAME));
            while (in.hasNextLine()){
                resultText.append(in.nextLine());
            }
            System.out.println(resultText);
            TextHolder holder = new TextHolder(resultText.toString(), "amet");
            System.out.println("Found position : " + AlgorithmUtil.search(holder));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
