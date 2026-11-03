
import java.util.Scanner;

public class tugas2ParkirFlowchart22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize variables: type, duration, total = 0
        int type, duration, total = 0;

        do {
            System.out.print("Enter vehicle type (1 = Car, 2 = Motorcycle, 0 = Exit): ");
            type = sc.nextInt();

            if (type == 1 || type == 2) {
                System.out.print("Enter parking duration (hours): ");
                duration = sc.nextInt();

                if (type == 1) {
                    total += duration * 3000; // car: Rp 3,000 per hour
                } else {
                    total += duration * 2000; // motorcycle: Rp 2,000 per hour
                }
            }
        } while (type != 0);

        System.out.println("Total parking fees: Rp " + total);

        sc.close();
    }
}
