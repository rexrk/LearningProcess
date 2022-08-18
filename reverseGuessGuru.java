import java.util.Random;
import java.util.Scanner;
//think a number
//genrate a random num
//ask higher or lower
//binary search
class GameFiles {
    static Random rand = new Random();
    static int RandomNum = rand.nextInt(1000);

    public int getRandomNumber() {
        return RandomNum;
    }

    public static int isCorrectNumber(int userInput) {
        // Binary Search
        int first=0;
        int last = 1000;
        if (userInput == 1) {
            first = RandomNum + 1;
        } else if (userInput == 2) {
            last = RandomNum - 1;
        } else if( userInput == 3){
            System.out.println("oki Its: " + RandomNum);
            System.exit(0);
        }
        System.out.println("First:"+ first + "      Last:" + last);
        int mid = (first + last) / 2;
        RandomNum = mid;
        return mid;
    }
}

public class guess_numberAI {

    public static void main(String[] gugus) {
        GameFiles obFiles = new GameFiles();
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Think a Number:>>>>>>>>");
        System.out.print("Is this the number ? -> ");
        System.out.println(obFiles.getRandomNumber());

        while (userInput != 3) {
            System.out.println("1.Higher 2.Lower 3.Thats it");
            System.out.println("Is this the number ? ->" + GameFiles.isCorrectNumber(scan.nextInt()));
        }
        scan.close();
    }

}
