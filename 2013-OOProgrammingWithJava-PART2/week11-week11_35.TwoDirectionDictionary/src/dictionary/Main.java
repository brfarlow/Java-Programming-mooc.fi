package dictionary;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Test your dictionary here
    MindfulDictionary s = new MindfulDictionary("test/tmp/tmp74500.txt");
s.add("tietokone", "computer");
s.save();
        System.out.println(s.translate("tietokone"));
    }
}
