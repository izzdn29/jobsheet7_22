import java.util.Scanner;

public class tugas1TiketBioskop22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TICKET_PRICE = 50000;
        int quantity;
        int totalTickets = 0;
        double totalRevenue = 0;
        int customerNo = 0;

        System.out.println("=== Cinema Ticket Sales ===");
        System.out.println("Enter the number of tickets per customer (0 to finish the day).");

        while (true) {
            System.out.print("Customer " + (customerNo + 1) + " - number of tickets: ");
            quantity = sc.nextInt();

            // Invalid input (negative): ignore and ask again
            if (quantity < 0) {
                System.out.println("Invalid quantity. Please enter a valid quantity!");
                continue;
            }

            // 0 means no more customers
            if (quantity == 0) {
                break;
            }

            double discount = 0;
            if (quantity > 10) {
                discount = 0.15;
            } else if (quantity > 4) {
                discount = 0.10;
            }

            double price = quantity * TICKET_PRICE * (1 - discount);
            System.out.println("Discount: " + (int) (discount * 100) + "%");
            System.out.println("Amount to pay: Rp " + (long) price);

            totalTickets += quantity;
            totalRevenue += price;
            customerNo++;
        }

        System.out.println("=== Daily Summary ===");
        System.out.println("Total customers      : " + customerNo);
        System.out.println("Total tickets sold   : " + totalTickets);
        System.out.println("Total ticket revenue : Rp " + (long) totalRevenue);

        sc.close();
    }
}
