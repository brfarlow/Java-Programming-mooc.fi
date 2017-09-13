
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        
        if(guessedLetters.contains(letter)){// if the letter has already been guessed, nothing happens
            
        }else if(!word.contains(letter)){   // it the word does not contains the guessed letter, number of faults increase
            numberOfFaults++;
            guessedLetters += letter;
        }else{                             // the letter is added among the already guessed letters
            guessedLetters += letter;
        }

        
        
        
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        String hiddenWord = "";
        int i = 0;
        char letter;
        while(i < this.word.length()){
            
            letter = word.charAt(i);
            
            if(guessedLetters.contains(""+letter)){
                
                hiddenWord+=letter;
            }else{
                hiddenWord += "_";
            }
                   
            i++;
        }
        // if the letter in turn is within the guessed words, put it in to the hidden word
        
        
        // if the letter is not among guessed, replace it with _ in the hidden word 
        

        // return the hidden word at the end
        return hiddenWord;
    }
}
