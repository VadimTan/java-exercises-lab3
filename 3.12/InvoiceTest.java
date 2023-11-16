public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("123", "Widget", 5, 9.99);

        System.out.println("Invoice Details:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Part Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price Per Item: $" + invoice1.getPricePerItem());
        System.out.printf("Invoice Amount: $%.2f%n", invoice1.getInvoiceAmount());

        invoice1.setQuantity(7);
        invoice1.setPricePerItem(12.99);

        System.out.println("\nUpdated Invoice Details:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Part Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price Per Item: $" + invoice1.getPricePerItem());
        System.out.printf("Invoice Amount: $%.2f%n", invoice1.getInvoiceAmount());
    }
}
