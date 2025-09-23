import Storage.Colour;

public class Bag {
    //    String colour;
    String material;
    Item content;
    Colour colour;
    private double finalPrice;
    private double discount;
    private double price;
    boolean hasZipper;

    public String getFullInfo() {
        String MaterialInfo = getMaterialInfo();
        return String.format("The bag contain: %s\nThe bag colour: %s\nThe bag discount is %s percent\n"
                        + "and the total price will be %s", content.itemName, colour.colourName, discount, finalPrice,
                MaterialInfo);
    }

    public String getMaterialInfo() {
        return String.format("\nThe bag is made of: %s\n", content.itemName);
    }

    public void fillTheBag(Item item) {
        this.content = item;
    }

    public void ContainZipper() {

    }

    public void calculateFinalPrice(double price, double discount) {
        this.price = price;
        this.discount = discount;
        this.finalPrice = price - (price * discount / 100);

    }
}
