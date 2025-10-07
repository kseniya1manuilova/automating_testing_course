import java.util.Scanner;

public class HomeworkProgram {

    public static void runHomework() {
        myFirstProgram();
        homework1Task1();
        homework1Task2();
        homework1Task3();

        homework2Task1();
        homework2Task2();
        homework2Task3();
        homework2Task4();

        additionalHomework2Task1();
        additionalHomework2Task2();
        additionalHomework2Task3();
        additionalHomework2Task4();
        additionalHomework2Task5();
        additionalHomework2Task6();
        additionalHomework2Task7();
        additionalHomework2Task8();
        additionalHomework2Task9();
    }

    public static void myFirstProgram() {
        System.out.println("Hello world!");
    }

    public static void homework1Task1() {
        String firstName = "Kseniya";
        String lastName = "Manuilava";
        String jobTitle = "QA engeneer";

        System.out.println(firstName + " " + lastName + " works as a " + jobTitle + ".");
    }

    public static void homework1Task2() {
        byte age = 31;
        short yearOfBirth = 1994;
        int phoneNumber = 291111111;
        double BodyTemperature = 36.6;

        float height;
        height = 1.7F;

        boolean newMember;
        newMember = true;

        char gender;
        gender = 'F';

        String shortSummary = "My age is %d, I was born in %d and my phone number is %d.";

        String shortSummaryResult = String.format(shortSummary, age, yearOfBirth, phoneNumber);

        System.out.println(shortSummaryResult);
        System.out.println(BodyTemperature);
        System.out.println(height);
        System.out.println(newMember);
        System.out.println(gender);
    }

    public static void homework1Task3() {
        Scanner scannerData = new Scanner(System.in);

        String expectedCityName = "Minsk";
        System.out.println("Please, write your city");

        String userCity;
        userCity = scannerData.nextLine();

        System.out.println(userCity.equals(expectedCityName));

        System.out.println("Your have entered: " + userCity);

        int stringLenght = userCity.length();
        boolean cityNameFilledIn = userCity.isEmpty();
        char firstLetterOfTheCity = userCity.charAt(0);

        System.out.println("City lenght: " + stringLenght);

        String defaultCityName;
        defaultCityName = "Vitebsk";

        boolean cityNameAreEqual = userCity.equals(defaultCityName);

        boolean cityNameHaveEqualCaseInSensitive = userCity.equalsIgnoreCase(defaultCityName);

        boolean cityNameStartsWith = userCity.startsWith("V");

        boolean cityNameEndsWith = userCity.endsWith("k");

        boolean cityNameContains = userCity.contains("e");

        String updatedDefaultCity = defaultCityName.replace('b', 'B');

        String loweCaseDefaultCityName = defaultCityName.toLowerCase();

        System.out.println("The user left the input field emtpy: " + cityNameFilledIn);

        System.out.println("The first lerret of the City is " + firstLetterOfTheCity);

        System.out.println("Do the default city and the entered city match: " + cityNameAreEqual);

        System.out.println("The default city and the entered one have the same case in sensitive: "
                + cityNameHaveEqualCaseInSensitive);

        System.out.println("The City name contains 'd': " + cityNameContains);

        System.out.println("The City name starts 'V': " + cityNameStartsWith);

        System.out.println("The City name ends 'k': " + cityNameEndsWith);

        System.out.println(updatedDefaultCity);

        System.out.println(loweCaseDefaultCityName);

    }

    public static void homework2Task1() {
        Scanner scanner = new Scanner(System.in);
        int score;
        while (true) {
            System.out.println("Please enter your score: ");
            score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Incorrect value! Try again.");
            } else break;
        }
        if (score >= 90) {
            System.out.println("Your grade is A!");
        } else if (score >= 80) {
            System.out.println("Your grade is B!");
        } else if (score >= 70) {
            System.out.println("Your grade is C!");
        } else if (score >= 60) {
            System.out.println("Your grade is D!");
        } else if (score >= 50) {
            System.out.println("Your grade is E!");
        } else {
            System.out.println("Your grade is F!");
        }
    }

    public static void homework2Task2() {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please enter something: ");
            userInput = scanner.nextLine();
            System.out.println("You've entered: " + userInput);
        }
        while (!userInput.equals("Exit"));
        System.out.println("Bye!");
    }

    public static void homework2Task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        if (x >= 0) {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= x; i--) {
                sum += i;
            }
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }

    public static void homework2Task4() {
        class channel {
            int id;
            String name;

            channel(int id, String text) {
                this.id = id;
                this.name = text;
            }
        }
        channel[] channels = {
                new channel(1, "Nature"),
                new channel(2, "Culture"),
                new channel(3, "History"),
                new channel(4, "MTV")
        };
        Scanner scanner = new Scanner(System.in);
        int selectedChannel;
        while (true) {
            System.out.println("Please enter channel N or 0 to exit.");
            selectedChannel = scanner.nextInt();
            if (selectedChannel == 0) {
                System.out.println("Bye!");
                break;
            }
            if (selectedChannel > channels.length || selectedChannel < 0) {
                System.out.println("This channel does not exist, try again!");
            } else {
                System.out.println(channels[selectedChannel - 1].name);
            }

        }
    }

    public static void additionalHomework2Task1() {
        System.out.print("Please enter your number: ");
        int number = new Scanner(System.in).nextInt();
        String message = (number >= 10) ? "The number is greater than ten" : "The number is less than ten";
        System.out.println(message);
    }

    public static void additionalHomework2Task2() {
        System.out.print("Please enter first number: ");
        int firstNumber = new Scanner(System.in).nextInt();

        System.out.print("Please enter second number: ");
        int secondNumber = new Scanner(System.in).nextInt();
        if (firstNumber > secondNumber) {
            System.out.print("The first number is greater than the second.");
        } else if (firstNumber == secondNumber) {
            System.out.print("The numbers are equal.");
        } else System.out.print("The second number is greater than the first.");
    }

    public static void additionalHomework2Task3() {
        System.out.print("Please enter the lengths of the first side: ");
        int firstSide = new Scanner(System.in).nextInt();

        System.out.print("Please enter the lengths of the second side: ");
        int secondSide = new Scanner(System.in).nextInt();

        System.out.print("Please enter the lengths of the third side: ");
        int thirdSide = new Scanner(System.in).nextInt();

        if (firstSide == secondSide && secondSide == thirdSide) {
            System.out.print("Сongrats the triangle is equilateral!");
        } else if (firstSide == secondSide || secondSide == thirdSide || firstSide == thirdSide) {
            System.out.print("Сongrats the triangle is isosceles!");
        } else System.out.print("Сongrats the triangle is scalene!");
    }

    public static void additionalHomework2Task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 4 numbers:");
        int arraySize = 4;

        int[] numbers = new int[arraySize];
        int negative = 0;
        int positive = 0;

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            }
        }
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of positive numbers: " + positive);
    }

    public static void additionalHomework2Task5() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter 3 numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else System.out.println(c);
    }

    public static void additionalHomework2Task6() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter 3 numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int min = a;
        int max = a;

        if (b < min) {
            min = b;
        }
        if (b > max) {
            max = b;
        }
        if (c < min) {
            min = c;
        }
        if (c > max) {
            max = c;
        }
        int sum = max + min;
        System.out.println(sum);
    }

    public static void additionalHomework2Task7() {
        System.out.println("Please enter any number:");
        int number = new Scanner(System.in).nextInt();
        String message = (number % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(message);
    }

    public static void additionalHomework2Task8() {
        int beerPrice = 3;
        int applePrice = 2;
        int waterPrice = 1;
        int change = 0;

        String message = "Please select the product:\n1 -Beer, price: %d \n2 -Apple, price: %d\n3 -Water, price: %d";
        String messageResult = String.format(message, beerPrice, applePrice, waterPrice);
        System.out.println(messageResult);

        Scanner scanner = new Scanner(System.in);
        int selectedProduct = scanner.nextInt();

        System.out.println("Enter the amount: ");
        int enteredAmount = scanner.nextInt();

        int selectedProductPrice = 0;
        if (selectedProduct == 1) {
            selectedProductPrice = beerPrice;
        } else if (selectedProduct == 2) {
            selectedProductPrice = applePrice;
        } else if (selectedProduct == 3) {
            selectedProductPrice = waterPrice;
        }
        if (enteredAmount < selectedProductPrice) {
            System.out.println("There is not enough money!");
        } else if (enteredAmount == selectedProductPrice) {
            System.out.println("Thanks for your purchase!");
        } else change = enteredAmount - selectedProductPrice;
        System.out.println("Your change: " + change);
    }

    public static void additionalHomework2Task9() {
        int a = 1;
        int b = 4;

        do {
            int result = b * a;
            System.out.println(b + " * " + a + " = " + result);
            a++;
        } while (a <= 10);
    }
}
