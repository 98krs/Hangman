package Hangman;

import Hangman.Category;
import Hangman.Game;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Topic {

   //Creating Array List Passing thru Categories and names it Categories
   ArrayList<Category> categories = new ArrayList<>();

   //  Created Local Variable name as String
   String name;

//Created Constructer with argument to pass in String name aka the name of the Topic ex. Sports/ Nature
   public Topic(String name) {
       this.name = name;
   }

   // Entered Random Class into project
   Random rand = new Random();

//Created ArrayList Getter
   public ArrayList<Category> getCategories() {
       return categories;
   }
   // Set ArrayList
   public void setCategories(ArrayList<Category> categories) {
       this.categories = categories;
   }
   //Get Name Variable
   public String getName() {
       return name;
   }
// Set Name Variable
   public void setName(String name) {
       this.name = name;
   }
// Created Constructor Prompt Passing thru user input.  Goal is to prompt the user once chosen Topic
   public void prompt (Scanner userInput){
       // Welcomes user and Asks them to choose which category they want inside the Topic they previously Selected
       System.out.println("Welcome to " + name + ". Please choose: ");
       for(int i = 1; i<= categories.size(); i++){
           System.out.println(i + ". " + categories.get(i-1).getName());
//This takes the deciison and welcomes the user to the category they selected as well as chooses a random word for them to begin guessing
       }
       int decision = userInput.nextInt();
       Category selectedCategory = categories.get(decision - 1);
       System.out.println(" Welcome to "+ selectedCategory.getName() + " Hangman. ");
       ArrayList<String>wordList = selectedCategory.getWords().getWords();
       int index = rand.nextInt() % wordList.size();
       if (index < 0) {
           index *= -1;
       }
       // Created New Instance of Game that tells the user if they win or lose
       Game game = new Game(wordList.get(index));
       boolean win = game.play(userInput);
       if (win){
           System.out.println("You Won!");
       }
       else {
           System.out.println("Loser");
       }
   }


}





