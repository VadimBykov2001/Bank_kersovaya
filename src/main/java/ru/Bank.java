package ru.tn.courses.vbykov.v1.task2;
import ru.tn.courses.vbykov.v1.task2.business.InternetBank;
import ru.tn.courses.vbykov.v1.task2.business.MyBank;
import ru.tn.courses.vbykov.v1.task2.models.Consumer;
import ru.tn.courses.vbykov.v1.task2.repositories.ConsumerRepository;
import ru.tn.courses.vbykov.v1.task2.repositories.OrderRepository;
import java.util.Scanner;

public class Bank {

    
    public static void main(String[] args) {
        OrderRepository orderRepository = OrderRepository.getInstance();
        ConsumerRepository consumerRepository = ConsumerRepository.getInstance();
        InternetBank bank = new MyBank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите команду: \n" + "exit: выйти\n" + "help: справка\n" + "create: создать заказ\n" + "return: отказаться от услуги\n" + "modif: изменить заказ\n" + "payment: оплатить\n" + "catalog: вывести католог услуг\n" + "orders: вывести список заказов\n");
        while (true) {
            try {
                switch (scanner.nextLine()) {
                    case "help":
                        System.out.println("exit: выйти\n" + "help: справка\n" + "create: создать заказ\n" + "return: отказаться от услуги\n" + "modif: изменить заказ\n" + "payment: оплатить\n" + "catalog: вывести католог услуг\n" + "orders: вывести список заказов\n" + "reg: регистрация потребител\n" + "users: список потребителей");
                        break;
                    case "exit":
                        System.exit(1);
                        break;
                    case "create":
                        System.out.println("Введите ваше имя: ");
                        String consumerName = scanner.nextLine();
                        System.out.println("Выберите услугу которую хотите приобрести: (введите id услуги для приобретения)");
                        System.out.println(bank.catalog());
                        bank.createOrder(Integer.valueOf(scanner.nextLine()), consumerName);
                        System.out.println("Заказ был успешно создан");
                        break;
                    case "orders":
                        System.out.println(orderRepository.findAll());
                        break;
                    case "catalog":
                        System.out.println(bank.catalog());
                        break;
                    case "modif":
                        System.out.println("Введите id заказа");
                        Integer orderId = Integer.valueOf(scanner.nextLine());
                        System.out.println("Выберите услугу которую хотите приобрести:");
                        System.out.println(bank.catalog());
                        bank.modifOrder(orderId, Integer.valueOf(scanner.nextLine()));
                        System.out.println("Заказ успешно изменен");
                        break;
                    case "payment":
                        System.out.println("Введите id заказа");
                        orderId = Integer.valueOf(scanner.nextLine());
                        bank.payment(orderId);
                        System.out.println("Оплата успешно произведена");
                        break;
                    case "return":
                        System.out.println("Введите id заказа:");
                        bank.returnProduct(Integer.valueOf(scanner.nextLine()));
                        System.out.println("Отказ от услуги успешно выполнен");
                        break;
                    case "reg":
                        System.out.println("Введите имя потребителя");
                        String name = scanner.nextLine();
                        System.out.println("Введите количество капитала на счету потребителя");
                        customerRepository.save(new Customer(customerRepository.getSize(), name, Double.valueOf(scanner.nextLine())));
                        System.out.println("Пользователь успешно создан");
                        break;
                    case "users":
                        System.out.println(customerRepository.findAll());
                        break;
                    default:
                        System.out.println("Команда не понятна, help - справка");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
