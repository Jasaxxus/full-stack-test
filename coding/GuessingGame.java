import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int random = new Random().nextInt(1000, 10000);
        Scanner scanner = new Scanner(System.in);
        int userNum = 0;
        for (int i = 0; i < 20; i++) {
            try {
                userNum = scanner.nextInt();
                if (userNum >= 10000) {
                    System.out.println("Your number is too big!");
                    continue;
                } else if (userNum <= 999) {
                    System.out.println("Your number is too small!");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("You entered wrong number!");
            }
            if (userNum == random) {
                System.out.println("YOU WIN!");
                break;
            }
            compare(random, userNum);
        }
        System.out.println("The number is " + random);
    }

    public static void compare(int random, int userNum) {
        int mNumber = 0;
        int pNumber = 0;
        char[] randomArr = String.valueOf(random).toCharArray();
        char[] userNumArr = String.valueOf(userNum).toCharArray();
        for (int i = 0; i < randomArr.length; i++) {
            if ((int) randomArr[i] == (int) userNumArr[i]) {
                pNumber++;
                continue;
            }
            for (int j = 0; j < userNumArr.length; j++) {
                if ((int) randomArr[i] == (int) userNumArr[j]) {
                    mNumber++;
                }
            }
        }
        System.out.println("P:" + pNumber + " M:" + mNumber);
    }
}
