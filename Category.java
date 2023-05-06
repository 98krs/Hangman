package Hangman;

import java.util.ArrayList;

public class Category {
//Created name Variable
   private String name;
// Passing Words Class into Category Class
   private Words words = new Words();
   //Created Constructor with name as argument
   public Category(String name) {
       this.name = name;
   }
   //Getter for name
   public String getName() {
       return name;
   }
   // Setter for name
   public void setName(String name) {
       this.name = name;
   }
//Getter for words class
   public Words getWords() {
       return words;
   }
// Setter for words Class
   public void setWords(Words words) {
       this.words = words;
   }

   @Override
   public String toString() {
       return super.toString();
   }
}

