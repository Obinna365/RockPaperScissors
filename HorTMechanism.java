import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HorTMechanism {
    public static void main(String[] args) {
        System.out.println("A game of heads and tails. Press quit to exit");
        for (;;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Heads or Tails");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("quit")){
                System.out.println("Thanks for Playing");
                break;
            }

            if (!choice.equalsIgnoreCase("Heads") && !choice.equalsIgnoreCase("Tails")){
                System.out.println("Invalid Input");
                continue;
            }

            System.out.println(choice);
            ArrayList<String> HeadsorTails = new ArrayList<>();
            HeadsorTails.add("Heads");
            HeadsorTails.add("Tails");
            if (choice.equalsIgnoreCase("Heads")){
                HeadsorTails.remove(0);
                System.out.println("I am Tails");
            } else if (choice.equalsIgnoreCase("Tails")){
                HeadsorTails.remove(1);
                System.out.println("I am Heads");
            }
            String output = HeadsorTails.get(0);

            ArrayList<String> newHeadsorTails = new ArrayList<>();
            Collections.shuffle(newHeadsorTails);
            newHeadsorTails.add("Heads");
            newHeadsorTails.add("Tails");
            String result = newHeadsorTails.get(0);


            System.out.println("Result:" + result); // Display the result
            if (choice.equalsIgnoreCase("Heads") && output.equalsIgnoreCase("tails")&& result.equalsIgnoreCase("Heads")){
                System.out.println("You Win");
            } else {
                System.out.println("You Lose");
            }

        }
    }
}
