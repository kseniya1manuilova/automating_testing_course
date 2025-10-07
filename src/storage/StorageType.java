package storage;

public class StorageType {
    protected String typeName;
    protected String material;
    protected String dateOfThePurchase;
    protected double yearOfProduction;
    public Colour colour;
    public Item content;

    public String storageInfo() {
        return String.format("Storage type is: " + typeName);
    }

    public String getDateOfThePurchase(){
        return String.format("The purchase was made: " + dateOfThePurchase);

    }
}
