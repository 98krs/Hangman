package Hangman;

import java.util.ArrayList;
import java.util.Random;
public class Words {
// Created Array List for words that passes thru a String.  Used in Working
   private ArrayList<String> words = new ArrayList<>();

//Getter for Array List.  Used Every time we made a word
   public ArrayList<String> getWords() {

       return words;
   }
   //Setter for Array List
   public void setWords(ArrayList<String> words) {
       this.words = words;
   }


}





