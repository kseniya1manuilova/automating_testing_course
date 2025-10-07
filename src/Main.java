import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Run Bag Program");
            System.out.println("2 - Run Homework Program");
            System.out.println("3 - Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1 -> BagProgram.runBagProgram(scanner);
                case 2 -> HomeworkProgram.runHomework();
                case 3 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Invalid option, try again!");
            }
        }
    }
}
