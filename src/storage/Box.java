package storage;

public class Box extends StorageType {
    private double price;
    private String boxUsage;


    public Box(String material, double price, String boxUsage) {
        this.material = material;
        this.price = price;
        this.boxUsage = boxUsage;
        typeName = "Box";
        yearOfProduction = 2009;
        dateOfThePurchase = "May 12";
    }

    public double getPrice() {
        return price;
    }

    public void fillTheBox(Item item) {
        this.content = item;
    }

    public String getFullInfo() {
        String MaterialInfo = getMaterialInfo();
        return String.format("The box contain: %s\nThe box colour: %s and the price will be %s. The purpose of this " +
                        "box: %s. ",
                content.itemName, colour.colourName, price, boxUsage, MaterialInfo);
    }

    public String getMaterialInfo() {
        return String.format("\nThe box is made of: %s\n", content.itemName);
    }

    public String getBoxInfo() {
        return String.format("\nYour item type is %s and it produced in: %.0f.", typeName, yearOfProduction);
    }

    @Override
    public String storageInfo() {
        return "Storage type is: " + typeName + ". Congratulations, your box is the best!";
    }
}
