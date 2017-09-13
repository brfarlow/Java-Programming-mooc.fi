/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Xorfos
 */
public class MindfulDictionary {

    private HashMap<String, String> dictionaryLanguageOne;
    private HashMap<String, String> dictionaryLanguageTwo;
    private Scanner reader;
    private FileWriter writer;
    private File file;

    public MindfulDictionary() {
        this.dictionaryLanguageOne = new HashMap<String, String>();
        this.dictionaryLanguageTwo = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        this.dictionaryLanguageOne = new HashMap<String, String>();
        this.dictionaryLanguageTwo = new HashMap<String, String>();

        this.file = new File(file);

    }

    public void add(String word, String translation) {

        //dictionaryLanguageTwo keeps the reverse translation to allow translating from either language
        //as we assume the key values are unique pairings
        if (!dictionaryLanguageOne.containsKey(word)) {
            dictionaryLanguageOne.put(word, translation);
            dictionaryLanguageTwo.put(translation, word);
        }

    }

    public String translate(String word) {
        if (dictionaryLanguageOne.containsKey(word)) {
            return this.dictionaryLanguageOne.get(word);
        } else if (dictionaryLanguageTwo.containsKey(word)) {
            return this.dictionaryLanguageTwo.get(word);
        }
        return null;
    }

    public void remove(String word) {

        if (dictionaryLanguageOne.containsKey(word)) {
            dictionaryLanguageTwo.remove(dictionaryLanguageOne.get(word)); //the key to remove is the value from dictionary one
            dictionaryLanguageOne.remove(word);
        } else if (dictionaryLanguageTwo.containsKey(word)) {
            dictionaryLanguageOne.remove(dictionaryLanguageTwo.get(word)); //the key to remove is the value from dictionary two
            dictionaryLanguageTwo.remove(word);
        }

    }

    public boolean load() {

        //make sure the file exists, if it can't be loaded return false.
        try {
            this.reader = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            return false;
        }

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] parts = line.split(":");
            this.add(parts[0], parts[1]);
        }

        return true;
    }

    public boolean save() {

        try {
            this.writer = new FileWriter(file);
            for (Entry<String, String> entry : this.dictionaryLanguageOne.entrySet()) {

                writer.write(entry.getKey());
                writer.write(":");
                writer.write(entry.getValue());
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            return false;
        }     
        return true;
    }

}
