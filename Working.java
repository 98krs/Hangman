package Hangman;

import Hangman.Category;
import Hangman.Topic;

import java.util.*;

public class Working {

   public static void main(String []  args) {

// Added Class Category named baseball and added baseball words in Class Word Array LIst using get method
       Category baseball = new Category("Baseball");
       Words baseballWords = new Words();
       baseballWords.getWords().add("Orioles");
       baseballWords.getWords().add("Yankees");
       baseballWords.getWords().add("Mike Trout");
       baseballWords.getWords().add("Christian Yelich");
       baseballWords.getWords().add("Marlins");
       baseballWords.getWords().add("Blue Jays");
       baseballWords.getWords().add("Red Sox");
       baseballWords.getWords().add("White Sox");
       baseballWords.getWords().add("Astros");
       baseballWords.getWords().add("Royals");
       baseballWords.getWords().add("Phillies");
       baseballWords.getWords().add("Bryce Harper");
       baseballWords.getWords().add("Giancarlo Stanton");
       baseballWords.getWords().add("Cedric Mullins");
       baseballWords.getWords().add("Mookie Betts");
       baseballWords.getWords().add("Vladmir Guerrero");
       baseballWords.getWords().add("Shohei Ohtani");
       baseball.setWords(baseballWords);

// Added Class Category named Football and added football words in Class Word Array List using get method
       Category football = new Category("Football");
       Words footballWords = new Words();
       footballWords.getWords().add("Commanders");
       footballWords.getWords().add("Ravens");
       footballWords.getWords().add("Patriots");
       footballWords.getWords().add("Chiefs");
       footballWords.getWords().add("Bengals");
       footballWords.getWords().add("Bills");
       footballWords.getWords().add("Josh Allen");
       footballWords.getWords().add("Tom Brady");
       footballWords.getWords().add("Buccaneers");
       footballWords.getWords().add("Dolphins");
       footballWords.getWords().add("Tua Tagovalia");
       footballWords.getWords().add("Giants");
       footballWords.getWords().add("Cowboys");
       footballWords.getWords().add("Dak Prescott");
       footballWords.getWords().add("Eagles");
       footballWords.getWords().add("Justin Hurts");
       footballWords.getWords().add("Jaamar Chase");
       footballWords.getWords().add("Derek Henry");
       footballWords.getWords().add("Titans");
       football.setWords(footballWords);

// Added Class Category named Basketball and added Basketball words in Class Word Array LIst using get method
       Category basketball = new Category("Basketball");
       Words basketballWords = new Words();
       basketballWords.getWords().add("Wizards");
       basketballWords.getWords().add("Kevin Durant");
       basketballWords.getWords().add("Warriors");
       basketballWords.getWords().add("Suns");
       basketballWords.getWords().add("John Wall");
       basketballWords.getWords().add("Cavaliers");
       basketballWords.getWords().add("Lakers");
       basketballWords.getWords().add("Kobe Bryant");
       basketballWords.getWords().add("Michael Jordan");
       basketballWords.getWords().add("Bulls");
       basketballWords.getWords().add("Scottie Pippen");
       basketballWords.getWords().add("Thunder");
       basketballWords.getWords().add("Russel Westbrook");
       basketballWords.getWords().add("Chris Paul");
       basketballWords.getWords().add("Blake Griffen");
       basketballWords.getWords().add("Clippers");
       basketballWords.getWords().add("Nets");
       basketballWords.getWords().add("Kyrie Irving");
       basketballWords.getWords().add("James Harden");
       basketballWords.getWords().add("Heat");
basketball.setWords(basketballWords);

//Created New Topic Sports and Passed thru baseball basketball and football categories Created Above
       Topic sports = new Topic("Sports");
       sports.getCategories().add(baseball);
       sports.getCategories().add(football);
       sports.getCategories().add(basketball);

// Added Class Category named EasternHemisphere and added EasternHemisphere words in Class Word Array LIst using get method
       Category easternHemisphere = new Category("easternHemisphere");
       Words easternHemisphereWords = new Words();
       easternHemisphereWords.getWords().add("India");
       easternHemisphereWords.getWords().add("China");
       easternHemisphereWords.getWords().add("North Korea");
       easternHemisphereWords.getWords().add("Indonesia");
       easternHemisphereWords.getWords().add("Pakistan");
       easternHemisphereWords.getWords().add("Philippines");
       easternHemisphereWords.getWords().add("Malaysia");
       easternHemisphereWords.getWords().add("Russia");
       easternHemisphereWords.getWords().add("South Korea");
       easternHemisphereWords.getWords().add("Japan");
       easternHemisphereWords.getWords().add("Egypt");
       easternHemisphereWords.getWords().add("Vietnam");
       easternHemisphereWords.getWords().add("Iran");
       easternHemisphereWords.getWords().add("Turkey");
       easternHemisphereWords.getWords().add("Germany");
       easternHemisphereWords.getWords().add("Thailand");
       easternHemisphereWords.getWords().add("Nepal");
       easternHemisphereWords.getWords().add("Italy");
       easternHemisphereWords.getWords().add("Myanmar");
       easternHemisphereWords.getWords().add("Kenya");
       easternHemisphere.setWords(easternHemisphereWords);

       // Added Class Category named WesternHemisphere and added WesternHemisphere words in Class Word Array LIst using get method
       Category westernHemisphere = new Category("westernHemisphere");
       Words westernHemisphereWords = new Words();
       westernHemisphereWords.getWords().add("Canada");
       westernHemisphereWords.getWords().add("Chile");
       westernHemisphereWords.getWords().add("Bahamas");
       westernHemisphereWords.getWords().add("columbia");
       westernHemisphereWords.getWords().add("Cuba");
       westernHemisphereWords.getWords().add("Ecuador");
       westernHemisphereWords.getWords().add("United State");
       westernHemisphereWords.getWords().add("haiti");
       westernHemisphereWords.getWords().add("mexico");
       westernHemisphereWords.getWords().add("Jamaica");
       westernHemisphereWords.getWords().add("Panama");
       westernHemisphereWords.getWords().add("Spain");
       westernHemisphereWords.getWords().add("Venezuela");
       westernHemisphereWords.getWords().add("Togo");
       westernHemisphereWords.getWords().add("Iceland");
       westernHemisphereWords.getWords().add("Honduras");
       westernHemisphereWords.getWords().add("Brazil");
       westernHemisphereWords.getWords().add("Costa Rica");
       westernHemisphereWords.getWords().add("Argentina");
       westernHemisphereWords.getWords().add("Bolivia");
       westernHemisphere.setWords(westernHemisphereWords);

//Created new Topic named Countrys and Passed thru easten and western hemisphere Categories
       Topic countrys = new Topic("Country's");
       countrys.getCategories().add(easternHemisphere);
       countrys.getCategories().add(westernHemisphere);



// Added Class Category named National Parks and added Naitonal Parks words in Class Word Array LIst using get method

       Category national_parks = new Category("National Parks");
       Words national_parksWords = new Words();
       national_parksWords.getWords().add("Shenandoah");
       national_parksWords.getWords().add("Yosemite");
       national_parksWords.getWords().add("Yellowstone");
       national_parksWords.getWords().add("Zion");
       national_parksWords.getWords().add("Glacier");
       national_parksWords.getWords().add("Arches");
       national_parksWords.getWords().add("Acadia");
       national_parksWords.getWords().add("Olympic");
       national_parksWords.getWords().add("Sequoia");
       national_parksWords.getWords().add("Everglades");
       national_parksWords.getWords().add("Badlands");
       national_parksWords.getWords().add("Canyonlands");
       national_parksWords.getWords().add("Voyageurs");
       national_parksWords.getWords().add("Saguaro");
       national_parksWords.getWords().add("Congaree");
       national_parksWords.getWords().add("Pinnacles");
       national_parksWords.getWords().add("Grand Canyon");
       national_parksWords.getWords().add("Rocky Mountain");
       national_parksWords.getWords().add("Great Smoky Mountains");
       national_parksWords.getWords().add("North Cascades");
       national_parks.setWords(national_parksWords);

// Added Class Category named Ocean and added Ocean words in Class Word Array LIst using get method

       Category ocean = new Category("Ocean");
       Words oceanWords = new Words();
       oceanWords.getWords().add("wave");
       oceanWords.getWords().add("coral");
       oceanWords.getWords().add("sand");
       oceanWords.getWords().add("high tide");
       oceanWords.getWords().add("reef");
       oceanWords.getWords().add("bay");
       oceanWords.getWords().add("archipelago");
       oceanWords.getWords().add("seaweed");
       oceanWords.getWords().add("estuary");
       oceanWords.getWords().add("underwater");
       oceanWords.getWords().add("cove");
       oceanWords.getWords().add("beach");
       oceanWords.getWords().add("coast");
       oceanWords.getWords().add("shoreline");
       oceanWords.getWords().add("seawater");
       oceanWords.getWords().add("seaspray");
       oceanWords.getWords().add("tsunami");
       oceanWords.getWords().add("island");
       oceanWords.getWords().add("Mariana Trench");
       oceanWords.getWords().add("bioluminescence");
       ocean.setWords(oceanWords);

// Added Class Category named Weather and added Weather words in Class Word Array LIst using get method

       Category weather = new Category("Weather");
       Words weatherWords = new Words();
       weatherWords.getWords().add("thunder");
       weatherWords.getWords().add("rain");
       weatherWords.getWords().add("lightning");
       weatherWords.getWords().add("flood");
       weatherWords.getWords().add("snow");
       weatherWords.getWords().add("hail");
       weatherWords.getWords().add("blizzard");
       weatherWords.getWords().add("tornado");
       weatherWords.getWords().add("storm");
       weatherWords.getWords().add("fog");
       weatherWords.getWords().add("hurricane");
       weatherWords.getWords().add("wind");
       weatherWords.getWords().add("rainbow");
       weatherWords.getWords().add("sleet");
       weatherWords.getWords().add("drought");
       weatherWords.getWords().add("cloud");
       weatherWords.getWords().add("cumulonimbus");
       weatherWords.getWords().add("freezing");
       weatherWords.getWords().add("humid");
       weatherWords.getWords().add("cold");
       weather.setWords(weatherWords);

      
       // Created new Topic- Nature and pased thru Categories natiioal parks, oceans, and weaether
       Topic nature = new Topic("Nature");
       nature.getCategories().add(national_parks);
       nature.getCategories().add(ocean);
       nature.getCategories().add(weather);

// Added Class Category named Instruments and added Instruments words in Class Word Array LIst using get method

       Category instruments = new Category("Instruments");
       Words instrumentsWords = new Words();
       instrumentsWords.getWords().add("Guitar");
       instrumentsWords.getWords().add("Violin");
       instrumentsWords.getWords().add("Saxophone");
       instrumentsWords.getWords().add("Piano");
       instrumentsWords.getWords().add("Clarinet");
       instrumentsWords.getWords().add("Trombone");
       instrumentsWords.getWords().add("Cello");
       instrumentsWords.getWords().add("Trumpet");
       instrumentsWords.getWords().add("Drums");
       instrumentsWords.getWords().add("Flute");
       instrumentsWords.getWords().add("Harp");
       instrumentsWords.getWords().add("Banjo");
       instrumentsWords.getWords().add("Tambourine");
       instrumentsWords.getWords().add("Harmonica");
       instrumentsWords.getWords().add("Maracas");
       instrumentsWords.getWords().add("Accordion");
       instrumentsWords.getWords().add("Ukulele");
       instrumentsWords.getWords().add("Bagpipes");
       instrumentsWords.getWords().add("Triangle");
       instrumentsWords.getWords().add("Ocarina");
       instruments.setWords(instrumentsWords);

// Added Class Category named Musicians and added Musicians words in Class Word Array LIst using get method

       Category musicians = new Category("Musicians");
       Words musiciansWords = new Words();
       musiciansWords.getWords().add("Ariana Grande");
       musiciansWords.getWords().add("BTS");
       musiciansWords.getWords().add("Taylor Swift");
       musiciansWords.getWords().add("Megan Thee Stallion");
       musiciansWords.getWords().add("Cardi B");
       musiciansWords.getWords().add("Lil Uzi Vert");
       musiciansWords.getWords().add("Nicki Minaj");
       musiciansWords.getWords().add("Michael Jackson");
       musiciansWords.getWords().add("Kanye West");
       musiciansWords.getWords().add("Eminem");
       musiciansWords.getWords().add("Drake");
       musiciansWords.getWords().add("Frank Ocean");
       musiciansWords.getWords().add("Tyler The Creator");
       musiciansWords.getWords().add("Billie Eilish");
       musiciansWords.getWords().add("The Weeknd");
       musiciansWords.getWords().add("Shawn Mendes");
       musiciansWords.getWords().add("Smino");
       musiciansWords.getWords().add("Lady Gaga");
       musiciansWords.getWords().add("Beyonce");
       musiciansWords.getWords().add("Rihanna");
       musicians.setWords(musiciansWords);

// Added Class Category named Music Types and added Music Types words in Class Word Array LIst using get method

       Category types = new Category("Types");
       Words typesWords = new Words();
       typesWords.getWords().add("Pop");
       typesWords.getWords().add("Hip Hop");
       typesWords.getWords().add("Rock");
       typesWords.getWords().add("Jazz");
       typesWords.getWords().add("Country");
       typesWords.getWords().add("Reggae");
       typesWords.getWords().add("Heavy Metal");
       typesWords.getWords().add("Indie");
       typesWords.getWords().add("Blues");
       typesWords.getWords().add("Classical");
       typesWords.getWords().add("R&B");
       typesWords.getWords().add("Soul");
       typesWords.getWords().add("Folk");
       typesWords.getWords().add("Punk");
       typesWords.getWords().add("Funk");
       typesWords.getWords().add("Instrumental");
       typesWords.getWords().add("Rock and Roll");
       typesWords.getWords().add("Latin");
       typesWords.getWords().add("Electro");
       typesWords.getWords().add("Dubstep");
       types.setWords(typesWords);

// Created New Topic Music and passed thru all Music Categories
       Topic music = new Topic("Music");
       music.getCategories().add(instruments);
       music.getCategories().add(musicians);
       music.getCategories().add(types);

       // Added Class Category named Car Brands and added Car Brands words in Class Word Array LIst using get method

       Category brands = new Category("Brands");
       Words carBrands = new Words();
       carBrands.getWords().add("Tesla");
       carBrands.getWords().add("Honda");
       carBrands.getWords().add("Toyota");
       carBrands.getWords().add("Jeep");
       carBrands.getWords().add("Ford");
       carBrands.getWords().add("Chrysler");
       carBrands.getWords().add("Acura");
       carBrands.getWords().add("Lexus");
       carBrands.getWords().add("Volkswagen");
       carBrands.getWords().add("Audi");
       carBrands.getWords().add("Mercedes-Benz");
       carBrands.getWords().add("Bugatti");
       carBrands.getWords().add("Dodge");
       carBrands.getWords().add("Ram");
       carBrands.getWords().add("Genesis");
       carBrands.getWords().add("Hyundai");
       carBrands.getWords().add("Kia");
       carBrands.getWords().add("Renault");
       carBrands.getWords().add("Buick");
       carBrands.getWords().add("Chevrolet");
       carBrands.getWords().add("Nissan");
       carBrands.getWords().add("Infiniti");
       brands.setWords(carBrands);

       //Created Topic Cars and Passed thru the created Category Brands
       Topic cars = new Topic("Cars");
       cars.getCategories().add(brands);

       // Created Varibale to use with Scanner to get user menu decision
       int menuDecision;
       Topic selectedTopic = null;


       boolean done = false; //loop
       while (done == false) { //loop
           System.out.println("Welcome to Team 2 Hangman. Available genres are listed below:");
           System.out.println("1. Sport");
           System.out.println("2. Country");
           System.out.println("3. Nature");
           System.out.println("4. Music");
           System.out.println("5. Cars");
           System.out.println("0. Exit");
           System.out.print("Select a genre (0 to exit): ");
           Scanner userInput = new Scanner(System.in);
           menuDecision = userInput.nextInt();
          
// Created Switch Statement for menu woth menu decision used as Scanner input to grab users decision 1,2,3,4, or 5
           switch (menuDecision) {


               case 1:
                   System.out.println("Thanks for choosing Hangman Sports. \n Do you think your a sports Junkie? \n" +
                           "Hangman Sports Edition will put you to the test.  \n " +
                           "Three Categories in Baseball, Football, and Basketball " +
                           "Provide a large array of different Sports. Try playing\n " +
                           "head to head with your friends to see who can get more correct in a row." +
                           "Do you have what it takes to beat Hangman Sports Edition?\n" +
                           "Give it a run and try it out if your a true Sports Junkie. ");
                   selectedTopic = sports;
                   break;
               case 2:
                   System.out.println("You choose country's. \n You play as a world traveler who has visited many countries and wants to test their knowledge of country names. Growing up, you always loved geography and would spend hours poring over \n maps of the world. As you got older, you traveled to different countries and learned more about their cultures and histories. Now, you want to see how many country names you can guess \n in a game of Hangman. With each correct guess, you feel a sense of pride in your world knowledge and a desire to keep playing and improving your skills. So, are you ready to put your \n country name knowledge to the test?");
                   selectedTopic = countrys;
                   break;
               case 3:
                   System.out.println("You choose nature.");
                   System.out.println("Welcome to Blue Springs State Park in Florida! You're swimming in the springs when you come across a manatee and touch it. Manatees are endangered and it is against the law\n to approach or touch them. A park ranger, seeing the situation, says that if you can win a game of hangman, he won't arrest you.");
                   selectedTopic = nature;
                   break;
               case 4:
                   System.out.println("You choose music.");
                   System.out.println("Once upon a time… Music conquered the world. Everybody loved nothing more than spreading music and happiness." +
                           "\nHowever, an evil wizard casted a spell that left the whole world silenced." +
                           "\nYou have decided to set forth and play a game of hangman to lift the spell and restore the love for music.");
                   selectedTopic = music;
                   break;
               case 5:
                   System.out.println("You choose Cars.");
                   System.out.println("TIK-TOK CHALLENGE! A pair of content creators have stopped you on the street. They are filming a tik-tok video, and ask you to participate. Play a game of hangman to win a free car!");
                   selectedTopic = cars;
                   break;
               case 0:
                   done=true;
                   System.exit(0);
           }

           selectedTopic.prompt(userInput);
       } //loop
   }


}


