package serves;

import model.Customer;

import java.util.List;

public class Custemerserves {
    public static void printCustomers(List<Customer> customers) {
        System.out.println("--------------------");
        if (customers.isEmpty()) {
            System.out.println("Sizda hali mijozlar mavjud emas !");
        }
        for (Customer costomer : customers) {
            System.out.println(costomer);
        }
        System.out.println("---------------");
    }
     
}
