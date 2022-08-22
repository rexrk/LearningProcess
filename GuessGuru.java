import java.util.Random;
import java.util.Scanner;

class GameFiles {
    private int RandomNum;
    int UserInput;
    private int noOfGuesses;

    GameFiles() {
        Random random = new Random(); // Random Number object
        RandomNum = random.nextInt(101);
    }

    void SetInput() {
        Scanner scan = new Scanner(System.in); // Scanner Object
        UserInput = scan.nextInt();
    }

    boolean isCorrectNumber() {
        boolean isCorrectNumber = false;
        noOfGuesses++;

        if (UserInput > RandomNum) {
            System.out.println("Go Lower >>");
        } else if (UserInput < RandomNum) {
            System.out.println("Go Higher <<");
        } else {
            System.out.println("Sounds Right :0 ");
            System.out.println("You guessed in " + noOfGuesses + " tries.");
            isCorrectNumber = true;
        }
        return isCorrectNumber;

    }

}

public class guess_number {

    public static void main(String[] args) {
        
        
        GameFiles objFiles = new GameFiles(); // Class Object with Num Constructor

        System.out.println("Random number generated!");
        // System.out.println(objFiles.getRandomNumber());

        do {
            System.out.print("Guess The Number : ");
            objFiles.SetInput();
        } while (objFiles.isCorrectNumber() == false);
        
    }
}
