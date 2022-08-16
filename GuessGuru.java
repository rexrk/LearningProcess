import java.util.Random;
import java.util.Scanner;

class GameFiles {
    private int RandomNum;
    int UserInput;
    private int noOfGuesses = 0;

    GameFiles(int r) {
        RandomNum = r;
    }

    public int getRandomNumber() {
        return RandomNum;
    }

    public void SetInput(int i) {
        UserInput = i;
    }

    public void setGuess() {
        noOfGuesses++;
    }

    public int getGuess() {
        return noOfGuesses;
    }

    boolean isCorrectNumber() {
        boolean isCorrectNumber = false;

        if (UserInput > RandomNum) {
            System.out.println("Go Lower >>");
        } else if (UserInput < RandomNum) {
            System.out.println("Go Higher <<");
        } else {
            System.out.println("Sounds Right :0 ");
            isCorrectNumber = true;
        }

        return isCorrectNumber;
    }

}

public class guess_number {

    public static void main(String[] gugu) {
        Random random = new Random(); // Random Number object
        Scanner scan = new Scanner(System.in); // Scanner Object
        GameFiles objFiles = new GameFiles(random.nextInt(101)); // Class Object with Num Constructor

        System.out.println("Random number generated!");
        // System.out.println(objFiles.getRandomNumber());

        while (objFiles.isCorrectNumber() == false) {
            objFiles.setGuess();
            System.out.print("Guess The Number : ");
            objFiles.SetInput(scan.nextInt());
        }
        System.out.println("You guessed in " + objFiles.getGuess() + " tries.");
    }
}
