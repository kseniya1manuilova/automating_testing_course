import storage.Bag;
import storage.Colour;
import storage.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Create a new bag");
            System.out.println("2 - Show previously added bags");
            System.out.println("3 - Exit");
            System.out.println("Chose any option: ");

            int selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1:
                    createBag(scanner);
                    break;
                case 2:
                    readBagInfoFromFile();
                    break;
                case 3:
                    System.out.println("Bye!");
                    return;
            }
        }
    }

    private static void saveBagInfoToFile(Bag bag, Item item) {
        try (FileWriter file = new FileWriter("/Users/kseniyamanuilava/GithubReps/Text.txt")) {
            file.write(bag.getMaterialInfo());
            file.write("The bag colour is: " + bag.colour.colourName + "\n");
            file.write("The bag final price will be: " + bag.getFinalPrice() + "\n");
            file.write("This bag from " + bag.collectionName + " collection\n");
            file.write("This bag contain: " + item.itemName + "\n");
            System.out.println("Your bag info saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readBagInfoFromFile() throws FileNotFoundException {
        File file = new File("/Users/kseniyamanuilava/GithubReps/Text.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> fileContents = new ArrayList<>();
        while (scanner.hasNext()) {
            fileContents.add(scanner.nextLine());
        }
        fileContents.forEach(System.out::println);
    }

    private static void createBag(Scanner scanner) {
        System.out.println("Enter bag colour: ");
        Colour colour = new Colour();
        colour.colourName = scanner.next();
        colour.colourNumber = 11;

        System.out.println("Enter bag material: ");
        String material = scanner.next();

        System.out.println("Enter bag price: ");
        double price = scanner.nextDouble();

        System.out.println("Enter bag discount: ");
        double discount = scanner.nextDouble();

        System.out.println("The bag has zipper? please type true or false: ");
        boolean hasZipper = scanner.nextBoolean();

        System.out.println("Enter collection name: ");
        String collectionName = scanner.next();

        Item pen = new Item("Pen", 2);

        Bag bag = new Bag(material, price, discount, hasZipper, collectionName);
        bag.colour = colour;
        bag.fillTheBag(pen);
        saveBagInfoToFile(bag, pen);


//        Bag linenBag = new Bag("linen", 200, 15, true, "Autumn25");
//
//        System.out.println("Please enter bag's colour:");
//        String inputColour = scanner.next();
//        Colour colour = new Colour();
//        colour.colourName = inputColour;
//        colour.colourNumber = 12;
//        linenBag.colour = colour;
//
//        Item keys = new Item("Keys", 1);
//        linenBag.fillTheBag(keys);
//
//        saveBagInfoToFile(linenBag, keys);
//        readBagInfoFromFile();
//
//        System.out.println(linenBag.getFullInfo());
//        System.out.println(linenBag.getBagInfo());
//        System.out.println(linenBag.storageInfo());
//
//        Box paperBox = new Box("Paper", 20, "Carrying things");
//        System.out.println("Please enter box's colour:");
//        String inputColour2 = scanner.next();
//        Colour colour2 = new Colour();
//        colour2.colourNumber = 9;
//        colour2.colourName = inputColour2;
//        paperBox.colour = colour2;
//
//        Item pen = new Item("Pen", 2);
//        paperBox.fillTheBox(pen);
//
//        System.out.println(paperBox.getFullInfo());
//        System.out.println(paperBox.getBoxInfo());
//        System.out.println(paperBox.storageInfo());
//    }

//      String firstName = "Kseniya";
//      String lastName = "Manuilava";
//      String jobTitle = "QA engineer";
//
//      System.out.println(firstName +" " + lastName + " works as a " + jobTitle + ".");
//
//      byte age = 31;
//      short yearOfBirth = 1994;
//      int phoneNumber = 291111111;
//      double BodyTemperature = 36.6;
//
//      float height;
//      height = 1.7F;
//
//      boolean newMember;
//      newMember = true;
//
//      char gender;
//      gender = 'F';
//
//      String shortSummary = "My age is %d, I was born in %d and my phone number is %d.";
//
//      String shortSummaryResult = String.format(shortSummary, age, yearOfBirth, phoneNumber);
//
//      System.out.println(shortSummaryResult);
//      System.out.println(BodyTemperature);
//      System.out.println(height);
//      System.out.println(newMember);
//      System.out.println(gender);
//
//        Scanner scannerData = new Scanner(System.in);
//
//        String expectedCityName = "Minsk";
//        System.out.println("Please, write your city");
//
//        String userCity;
//        userCity = scannerData.nextLine();
//
//        System.out.println(userCity.equals(expectedCityName));
//
//        System.out.println("Your have entered: " + userCity);
//
//        int stringLength = userCity.Length();
//        boolean cityNameFilledIn = userCity.isEmpty();
//        char firstLetterOfTheCity = userCity.charAt(0);
//
//        System.out.println("City Length: " + stringLength);
//
//        String defaultCityName;
//        defaultCityName = "Vitebsk";
//
//        boolean cityNameAreEqual = userCity.equals(defaultCityName);
//
//        boolean cityNameHaveEqualCaseInSensitive = userCity.equalsIgnoreCase(defaultCityName);
//
//        boolean cityNameStartsWith = userCity.startsWith("V");
//
//        boolean cityNameEndsWith = userCity.endsWith("k");
//
//        boolean cityNameContains = userCity.contains("e");
//
//        String userFirstNameAndYob = String.format("Имя пользователя %s, год рождения %d.", firstName, yearOfBirth);
//
//        String updatedDefaultCity = defaultCityName.replace('b', 'B');
//
//        String loweCaseDefaultCityName = defaultCityName.toLowerCase();
//
//        System.out.println("The user left the input field empty: " + cityNameFilledIn);
//
//        System.out.println("The first lerret of the City is " + firstLetterOfTheCity);
//
//        System.out.println("Do the default city and the entered city match: " + cityNameAreEqual);
//
//        System.out.println("The default city and the entered one have the same case in sensitive: "
//                + cityNameHaveEqualCaseInSensitive);
//
//        System.out.println("The City name contains 'd': " + cityNameContains);
//
//        System.out.println("The City name starts 'V': " + cityNameStartsWith);
//
//        System.out.println("The City name ends 'k': " + cityNameEndsWith);
//
//        System.out.println(updatedDefaultCity);
//
//        System.out.println(loweCaseDefaultCityName);
//
//        System.out.println(userFirstNameAndYob);

    }
}
