package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        
        WordInspection inspection = new WordInspection(file);
        System.out.println(inspection.wordCount());
        System.out.println(inspection.wordsContainingZ());
        System.out.println(inspection.wordsEndingInL());
        System.out.println(inspection.palindromes());
        System.out.println(inspection.wordsWhichContainAllVowels());

    }
}
