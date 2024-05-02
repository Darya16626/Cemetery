import java.util.ArrayList;
import java.util.Scanner;

public class Magaz {
    public static void main(String[] args) {
        String[] firms = {"Фирма1", "Фирма2", "Фирма3"};
        String[][] watches = {
                {"Rolex", "Фирма1"},
                {"Omega", "Фирма2"},
                {"IWC", "Фирма3"}
        };

        ArrayList<Customer> customers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите данные клиента для заказа " + (i + 1));
            System.out.print("Введите имя: ");
            String fullName = scanner.nextLine();
            System.out.print(" Введите Email: ");
            String email = scanner.nextLine();
            System.out.print("Номер телефона: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Доступные часы:");
            for (int j = 0; j < watches.length; j++) {
                System.out.println((j + 1) + ". " + watches[j][0] + " - " + watches[j][1]);
            }
            System.out.print("Введите номер позиции: ");
            int choice = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.print("Введите количество: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            customers.add(new Customer(fullName, email, phoneNumber, watches[choice], quantity));
        }
        System.out.println("Заказы:");
        for (Customer customer : customers) {
            System.out.println("Клиент: " + customer.getFullName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Номер телефона: " + customer.getPhoneNumber());
            System.out.println("Позиция: " + customer.getPosition()[0] + " - " + customer.getPosition()[1]);
            System.out.println("Количество: " + customer.getQuantity());
            System.out.println();
        }
    }
}
class Customer {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String[] position;
    private int quantity;
    public Customer(String fullName, String email, String phoneNumber, String[] position, int quantity) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.quantity = quantity;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String[] getPosition() {
        return position;
    }
    public int getQuantity() {
        return quantity;
    }
}