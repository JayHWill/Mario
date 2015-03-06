import java.util.Scanner;


public class Mario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size;
        int height = 0;
        while(true) {
            try {
                if (height < 0 || height > 23) {
                    System.out.println("Invalid entry. Input must be in the form of numbers between 0 and 23 " +
                            "inclusive.\nTry again.");
                    System.out.print("How high is the pyramid? (between 0 and 23 inclusive): ");
                    size = scanner.next();
                } else {
                    System.out.print("How high is the pyramid? (between 0 and 23 inclusive): ");
                    size = scanner.next();

                }
                if (size == null) {
                    System.out.println("Thank you! Have a nice day!");
                    return;
                }
                height = Integer.parseInt(size);
                if( height > 0 && height <24 ){
                    break;
                }

            } catch (NumberFormatException ex) {
                System.out.println("Invalid entry. Input must be in the form of numbers between 0 and 23 inclusive" +
                        ".\nTry again.");
                height = 0;
            }
        }

        int counter = 1;
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
}
