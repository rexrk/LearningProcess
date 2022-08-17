import java.util.Scanner;
import java.time.chrono.IsoChronology;
import java.util.Random;

class GameFiles {
    int RandomNum;
    private int UserInput;
    private int noOfGuesses;

    GameFiles(int g) {  //constructor for Scanning UserInput
        UserInput = g;
    }

    public int getUserInput() {
        return UserInput;
    }

    public void SetRandom(int r) {
        RandomNum = r;
    }

    public int isCorrectNumber() {

        if (RandomNum < UserInput) {
            // RandomNum++;                   
            RandomNum = (RandomNum + 1000) - RandomNum;    //optional logic
        } else if (RandomNum > UserInput) {
            RandomNum--;
        } else {
            System.out.print("\n :0 Sounds Right ");
        }
        return RandomNum;
    }

    public void setGuess() {
        noOfGuesses++;
    }

    public int getGuess() {
        return noOfGuesses;
    }

}

public class guess_numberAI {

    public static void main(String[] args) {
        Random random = new Random(); // Random Number object
        Scanner scan = new Scanner(System.in); // Scanner Object

        System.out.print("Enter a Number : ");
        GameFiles objFiles = new GameFiles(scan.nextInt()); // Class Object with scanner constructor
        System.out.println(objFiles.getUserInput());
        // System.out.println(objFiles.getRandomNumber());

        while (objFiles.isCorrectNumber() != objFiles.getUserInput()) {
            objFiles.setGuess();
            System.out.print("Random number generating: ");
            objFiles.SetRandom(random.nextInt(1000));
            System.out.println(objFiles.isCorrectNumber());
        }

        System.out.println("\n\t \tAI guessed in " + objFiles.getGuess() + " tries.");
    }
}
