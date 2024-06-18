import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mechanism {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors at any time type quite to exit the game");
        for (; ; ) {
            //Fixed Array
            String[] RPS = {"Rock", "Paper", "Scissors"};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose between Rock, Paper or Scissors");
            //Allows scanner to type text
            String result = scanner.nextLine().toLowerCase();

            if (result.equalsIgnoreCase("quit")){
                System.out.println("Thanks For Playing");
                break;
            }

            if (!result.equalsIgnoreCase("Rock") && !result.equalsIgnoreCase("Paper") && !result.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid Input");
                continue;
            }

            // array list
            ArrayList<String> newRPS = new ArrayList<>();
            //adds the array to the array list
            Collections.addAll(newRPS, RPS);
            //randomizes it
            Collections.shuffle(newRPS);

            //loops through the arraylist
            for (String element : newRPS) {
                System.out.println("Randomizer picks: " + element); // Print the randomly picked element
                if (element.equalsIgnoreCase(result)) {
                    System.out.println("It's a Draw!");
                    break;
                } else if ((element.equals("Rock") && result.equalsIgnoreCase("Scissors")) ||
                        (element.equals("Paper") && result.equalsIgnoreCase("Rock")) ||
                        (element.equals("Scissors") && result.equalsIgnoreCase("Paper"))) {
                    System.out.println("You Lose!");
                    break;
                } else {
                    System.out.println("You Win!");
                    break;
                }


                }
            }
        }
    }
