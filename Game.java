package Hangman;

import java.util.Random;
import java.util.Scanner;


public class Game {
   // Created word variable for class
   String word;
   // Created letter variable for class. With the goal to eventually tell the user how many letters are in their word
   int letters;
// Created Array to capture the users progress aka to fill in correct answers as the user goes.
   char [] progress;
   //Created int varibale to eventually show the user how many chances they have remaining
   int chances = 7;
   // Created Game Constructor Passing through word.
   public Game(String word) {
       this.word = word;
       // Set progress equal to char word length.  Or what has been guessed essentially.
       progress = new char[word.length()];
       // For loop that gets the length of the chosen random words and prints out an empty space or underscore for each space
       for(int i = 0; i < word.length(); i++){
           char c = word.charAt(i);
           if(c == ' '){
               progress [i] = ' ';
           }
           else {
               progress [i] =  '_';
           }
       }
   }
   //Getter for word  variable
   public String getWord() {
       return word;
   }
   // Setter for word Variable
   public void setWord(String word) {
       this.word = word;
   }
   //Created Play constructor and passed thru Scaner. Essentially says if you run out of chances you lose and if the code finished without having
   //Less than 0 chances the user wins.
   public boolean play(Scanner userInput){
       while (chances>0 && !winner()){
           drawBoard();
           guess(userInput);
       }



       System.out.println("The word was " + word);
       //All the logic to play game goes here
       return chances>0;
   }
   public void guess(Scanner userInput){
       System.out.println("Enter next guess");
       char userGuess = userInput.next().charAt(0);
       if (word.contains("" + userGuess)){
           System.out.println("Your guess did match");
           for(int i = 0; i<word.length(); i++){
               if(userGuess == word.charAt(i)){
                   progress[i] = userGuess;
               }
           }
       }else {
           chances -= 1;
           System.out.println("Your guess did not match");
       }
   }
   public void drawBoard(){
       System.out.println("\n ------------------------------------------");
       System.out.println("The length of your word is: " + word.length() + " letters");
       System.out.println("You have " + chances + " chances left");


       System.out.println(progress);
   }
   public boolean winner(){
       for(int i = 0; i<progress.length; i++){
           if (progress[i] == '_'){
               return false;
           }
       }

       return true;
   }

}


