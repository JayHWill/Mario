import java.util.Scanner;


public class Mario {

    public static void main(String[] args) {
        int height = input();
        int counter = 0;
        for (int i = 1; i <= height; i++) {
            for (int k = 0; k < height - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            if (counter < height) {
                System.out.println();
                counter++;
            }
        }
    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);
        String hold;
        int height;
        while (true) {
            try {
                System.out.print("How high is the pyramid? (between 0 and 23 inclusive): ");
                hold = scanner.next();
                height = Integer.parseInt(hold);
            } catch (NumberFormatException ex) {
                System.out.println("3Invalid entry. Input must be in the form of numbers between 0 and 23 inclusive" +
                        ".\nTry again.");
                continue;
            }
            if (height < 0 || height > 23) {
                System.out.println("Invalid entry. Input must be in the form of numbers between 0 and 23 " +
                        "inclusive.\nTry again.");
            } else if (height > 0 || height < 23) {
                return height;
            }
        }
    }
}
