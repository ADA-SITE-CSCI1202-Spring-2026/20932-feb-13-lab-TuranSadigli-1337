package week03.invoice;

public class Invoice {

    // Instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    /**
     * @param partNumber The part number
     * @param partDescription The part description
     * @param quantity The quantity being purchased
     * @param pricePerItem The price per item
     **/
    
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        // setting quantity with validation
        setQuantity(quantity);

        // setting price per item with validation
        setPricePerItem(pricePerItem);
    }

    // Getters and Setters:

    public String getPartNumber() {
        return partNumber;
    } // gets and returns the part number

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    } // sets part number

    public String getPartDescription() {
        return partDescription;
    } // gets and returns part description

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    } // sets part description

    public int getQuantity() {
        return quantity;
    } // gets and returns the quantity

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    } // sets quantity; if quantity is not greater than 0 (positive), then sets to 0.

    public double getPricePerItem() {
        return pricePerItem;
    } // gets and returns price for each item

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    } // sets price; if price is not greater than 0 (positive), then sets to 0.0.

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    } // calculates the invoice amount by multiplying quantity by price
}