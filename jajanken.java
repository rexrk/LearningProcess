import java.util.Random;
import java.util.Scanner;

public class jajanken {

    public static void main(String[] args) {
        System.out.println(">>>>>> JaJanken Game<<<<<<");

        Scanner scanf = new Scanner(System.in);
        System.out.print("1. Start\n2. Exit\n" + "Enter Your Choice: "); // Start Menu..
        byte startMenu = scanf.nextByte();

        // Game Starter
        switch (startMenu) {
            case 1 -> gameBegins();
            case 2 -> {
                System.out.println("Sayounara");
                System.exit(0);
            }
            default -> System.out.println("Invalid Entry!");
        }
    }


    // Main Game..
    static void gameBegins() {
        // AI generated number..
        Random random = new Random();
       

        Scanner scanf = new Scanner(System.in);

        byte wins = 0;
        byte loss = 0;
        byte counter = 0;

     System.out.println("Jan ken saisho......");

        while (counter < 5) {
            int intelliA = random.nextInt(3);

            System.out.println("\t 0.Rock** 1.Paper// 2.Scissors^^ ?");
            System.out.print("Choose: ");
            int userInput = scanf.nextByte();
            if (userInput == 0) {
                switch (intelliA) {
                    case 0 -> System.out.println("Draw");
                    case 1 -> {
                        System.out.println("Lost");
                        loss++; 
                    }
                    case 2 -> {
                        System.out.println("Won");
                        wins++;
                    }

                }
                System.out.println("You Choosed Rock**");
                switch (intelliA) {
                    case 0 -> System.out.println("A.I chooses Rock **");
                    case 1 -> System.out.println("A.I chooses Paper //");
                    case 2 -> System.out.println("A.I chooses Scissors ^^");
                }
                System.out.println("Wins Counter: " + wins);

            }

            else if (userInput == 1) {
                switch (intelliA) {
                    case 0 -> {
                        System.out.println("Won");
                        wins++;
                    }
                    case 1 -> System.out.println("Draw");
                    case 2 -> {
                        System.out.println("Lost");
                        loss++; 
                    }
                }
                System.out.println("You Choosed Paper //");
                switch (intelliA) {
                    case 0 -> System.out.println("A.I chooses Rock **");
                    case 1 -> System.out.println("A.I chooses Paper //");
                    case 2 -> System.out.println("A.I chooses Scissors ^^");
                }
                System.out.println("Wins Counter: " + wins);
            }

            else if (userInput == 2) {
                switch (intelliA) {
                    case 0 -> {
                        System.out.println("Lost");
                        loss++; 
                    }
                    case 1 -> {
                        System.out.println("Won");
                        wins++;
                    }
                    case 2 -> System.out.println("Draw");
                }
                System.out.println("You Choosed Scissors ^^");
                switch (intelliA) {
                    case 0 -> System.out.println("A.I chooses Rock **");
                    case 1 -> System.out.println("A.I chooses Paper //");
                    case 2 -> System.out.println("A.I chooses Scissors ^^");
                }
                System.out.println("Wins Counter: " + wins);
            }
            
            else {
                System.out.println("Violation !");
                wins --;
                System.out.println("Wins Counter: " + wins);
            }

            counter++;
        }

        if (wins > loss) {
            System.out.println("Yay ! You won the Match");
        }
        else if (wins == loss) {
            System.out.println("Match Draw..");
            
        } else
            System.out.println("You Lost the Match !");

    }
    
}
