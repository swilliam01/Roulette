import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        Random rand = new Random();
        double amount;
        double remainingAmount=0.0;
        boolean input;
        int counter=0;
        int counter2=0;
        System.out.println("WELCOME! Let's play some Roulette!\n");
        do {
            System.out.println("Enter the type of bet you would like to place (even|odd|high|low): ");
            String bet = keyboard.next();
            System.out.println("Enter you bet amount: ");
            amount = keyboard.nextInt();
            int index = rand.nextInt(36);
            if (index <= 18 && bet.equalsIgnoreCase("low")) {
                System.out.println("The ball landed on " + index);
                System.out.println("Congratulations, you've won.");
                remainingAmount += amount * 2;
                counter++;
            }else if (index >= 19 && bet.equalsIgnoreCase("high")) {
                System.out.println("The ball landed on " + index);
                System.out.println("Congratulations, you've won.");
                remainingAmount+=amount * 2;
                counter++;
            }else if (index % 2 == 0 && bet.equalsIgnoreCase("even")) {
                System.out.println("The ball landed on " + index);
                System.out.println("Congratulations, you've won.");
                remainingAmount+=amount * 2;
                counter++;

            } else if (index % 2 != 0 && bet.equalsIgnoreCase("odd")) {
                System.out.println("The ball landed on " + index);
                System.out.println("Congratulations, you've won.");
                remainingAmount+=amount * 2;
                counter++;

            } else {
                System.out.println("The ball landed on " + index);
                System.out.println("Sorry, you've lost this bet.");
                remainingAmount-= amount;
                counter2++;
            }
            System.out.println("You currently have: $" + remainingAmount);
            System.out.println("Would you like to play again (true|false)?");
            input = keyboard.nextBoolean();

        }while(input!=false);
        System.out.println("Thank you for playing!");
        System.out.println("This is how much money you have remaining: $"+remainingAmount);
        System.out.println("You've won "+ counter +" game(s) and lost "+ counter2 + " game(s)");
    }
}

