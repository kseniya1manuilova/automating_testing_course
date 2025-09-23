package Storage;

public class Bag extends StorageType {
    public String collectionName;
    private double finalPrice;
    private double discount;
    private double price;
    protected boolean hasZipper;

    public Bag(String material, double price, double discount, boolean hasZipper, String collectionName) {
        this.material = material;
        this.price = price;
        this.discount = discount;
        this.hasZipper = hasZipper;
        this.collectionName = collectionName;
        storageType = "Bag";
        yearOfProduction = 1990;
        dateOfThePurchase = "June 11";
        calculateFinalPrice();
    }

    public Bag(String material, double price) {
        this.material = material;
        this.price = price;
        calculateFinalPrice();
        getDateOfThePurchase();
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public String getFullInfo() {
        String MaterialInfo = getMaterialInfo();
        return String.format("The bag contain: %s\nThe bag colour: %s\nThe bag discount is %s percent\n"
                + "and the total price will be %s. The bag from %s collection.", content.itemName, colour.colourName,
                discount, finalPrice, collectionName, MaterialInfo);
    }

    public String getMaterialInfo() {
        return String.format("\nThe bag is made of: %s\n", material);
    }

    public String getBagInfo() {
        return String.format("\nYour item type is %s and it produced in: %.0f.", storageType, yearOfProduction);
    }

    public void fillTheBag(Item item) {
        this.content = item;
    }

    public String ContainZipper() {
        if (hasZipper = true) {
            return "This bad has a zipper.";
        } else return "This bad hasn't a zipper.";
    }

    public void setDiscount(double discount) {
        this.discount = discount;
        calculateFinalPrice();

    }

    public void setPrice(double price) {
        this.price = price;
        calculateFinalPrice();

    }

    private void calculateFinalPrice() {
        finalPrice = price - (price * discount / 100);
    }
}

