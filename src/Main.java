import model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner inTex = new Scanner(System.in);
    static Scanner inNum = new Scanner(System.in);
    static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("---------- MIJOZLAR ROYXATLAVCHI DASTURGA XUSH KELIBLIZ----------");
        System.out.println(
                "1.  Mijozlar ro'yxati\n" +
                        "2. Mijoz qo'shish\n" +
                        "3. Mijozni o'chirish\n" +
                        "4. Mijozni ishonchliligini tasdiqlash\n" +
                        "5. Mijozga qarzdorlik qo'shish\n" +
                        "6. Mijozdan qarzdorlik o'chirish\n" +
                        "7. Qarzdor mijozlarni topish\n" +
                        "8. Ishonchli mijozlarni topish\n" +
                        "9. Dasturdan chiqish\n" +
                        "-----Kiritish-----"
        );
        int choice = inNum.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("--------------------");
                if (customers.isEmpty()) {
                    System.out.println("Sizda hali mijozlar mavjud emas !");
                }
                for (Customer costomer : customers) {
                    System.out.println(costomer);
                }
                System.out.println("---------------");
            }
            case 2 -> {
                System.out.println("Yangi mijozni ism famiyasini kiritining:");
                String fullNema = inTex.nextLine();
                System.out.println("Yanhgi mijoz raqamini kiriting +998 :");
                String phoneNomber = inTex.nextLine();
                System.out.println("Yangi mijozni qarzini kiritining:");
                double debt = inNum.nextDouble();
                System.out.println("Bu mijoz ishonchlimi? y/n");
                boolean indentified = false;
                char choiceCus = inTex.next().charAt(0);
                if (choiceCus == 'y') {
                    indentified = true;
                }
                Customer newCustemer = new Customer(fullNema, phoneNomber, debt, indentified);

                customers.add(newCustemer);
                System.out.println("Mijoz muvaqiyatli bazaga qo'shildi ! ");
            }
            case 3 -> {


            }
            case 4 -> {

            }

            case 5 -> {

            }
            case 6 -> {

            }   
            case 7 -> {

            }
            case 8 -> {

            }

            default -> {
                System.out.println("Dastur o'z ishini boshladi");
                return;
            }

        }
    }}

