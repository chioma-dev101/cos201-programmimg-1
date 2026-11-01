import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String itemName;
        int quantity;
        double unitPrice;

        System.out.print("Enter item name: ");
        itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("Purchase Summary");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);

        input.close();
    }
}