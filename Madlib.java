
import java.util.Scanner;
import java.util.Random;

public class Madlib {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        String[] words = {"They all lived happily ever after.", "Suddenly, a dragon appeared!", "They discovered a hidden treasure."};
        
        
        System.out.println("Hello and welcome to the Madlib project. In this program you will enter words and the program will use them in a madlib. Have fun!!");
        
        
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();
        
        System.out.println("Now enter a second adjective: ");
        String adj2 = scanner.nextLine();
        
        System.out.println("Alright, let's put in a noun: ");
        String noun = scanner.nextLine();
        
        System.out.println("What about a plural noun: ");
        String pnoun = scanner.nextLine();
        
        System.out.println("Let's give this madlib some action, enter a verb: ");
        String verb = scanner.nextLine();
        
        System.out.println("Good, now put in your first verb in past tense: ");
        String pverb = scanner.nextLine();
        
        System.out.println("Your second verb in past tense: ");
        String pverb2 = scanner.nextLine();
        
        System.out.println("And now your final verb in past tense: ");
        String pverb3 = scanner.nextLine();
        
        System.out.println("Ok, now for the last verb, enter one that ends in -ing: ");
        String verbing = scanner.nextLine();
        
        
        int randomIndex = random.nextInt(words.length);
        
        
        System.out.println("\n  Here's the Mad lib thanks for playing :)");
        System.out.println("In a far-off land, there once lived a " + adjective + " knight named " + noun + ".");
        System.out.println("He was known for " + verbing + " the foul beasts that would " + verb + " the town.");
        System.out.println("On a " + adj2 + " night, " + noun + " " + pverb + " into a cave that was full of " + pnoun + ".");
        System.out.println(noun + " was shocked at first but quickly " + pverb2 + " the group of " + pnoun + ".");
        System.out.println(noun + " kept " + pverb3 + " in the cave until... " + words[randomIndex]);
        
        
        scanner.close();
    }
}
