package Storage;

public class StorageType {
    protected String storageType;
    protected String material;
    protected String dateOfThePurchase;
    protected double yearOfProduction;
    public Colour colour;
    public Item content;

    public String storageInfo() {
        this.storageType = storageType;
        return String.format("Storage type is: " + storageType);
    }

    public String getDateOfThePurchase(){
        this.dateOfThePurchase = dateOfThePurchase;
        return String.format("The purchase was made: " + dateOfThePurchase);

    }
}
