import java.util.Arrays;
import java.util.Scanner;
import models.User;
import models.Basket;
import models.Category;
import models.Product;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product prod1 = new Product("Хлеб", 30, 4.9);
        Product prod2 = new Product("Молоко", 60, 4.3);
        Product prod3 = new Product("Мясо", 600, 4.4);
        Product prod4 = new Product("Сыр", 500, 4.5);
        Product prod5 = new Product("Мука", 100, 4.1);

        Product prod6 = new Product("Лампочка", 30, 3.8);
        Product prod7 = new Product("Пылесос", 3000, 2);
        Product prod8 = new Product("Электронные часы", 900, 3.9);
        Product prod9 = new Product("Фен", 1500, 4.6);
        Product prod10 = new Product("Телевизор", 8000, 4.7);

        Product prod11 = new Product("Шариковая ручка", 20, 4.9);
        Product prod12 = new Product("Карандаш", 15, 4.6);
        Product prod13 = new Product("Линейка", 40, 4.5);
        Product prod14 = new Product("Набор карандашей", 250, 4.7);
        Product prod15 = new Product("Циркуль", 150, 3.8);

        //Категории продуктов
        Product[] name1 = {prod1, prod2, prod3, prod4, prod5};
        Product[] name2 = {prod6, prod7, prod8, prod9, prod10};
        Product[] name3 = {prod11, prod12, prod13, prod14, prod15};
        Category cat1 = new Category("Продуктовый отдел", name1);
        Category cat2 = new Category("Отдел электроники", name2);
        Category cat3 = new Category("Отдел канцелярии", name3);
        //
        Product[] boughtProducts = {};
        Basket basket = new Basket(boughtProducts);

        User log = new User("Ian", "123");

        System.out.println("Введите логин: ");

        while (true) {
            while (true) {
                String log_in = scan.nextLine();
                if (log_in.equals(log.login)) {
                    break;
                } else {
                    System.out.println("Вы ввыели неверный логин!");
                }
            }
            System.out.println("Введите пароль: ");
            while (true) {
                String pass_in = scan.nextLine();

                if (pass_in.equals(log.pass)) {

                    System.out.println("Успешная авторизация!");
                    break;
                } else {
                    System.out.println("Вы ввели неверный пароль!");
                }
            }
            while (true) {
                System.out.println("Выберите отдел: продуктовый, электроника, канцелярия");
                System.out.println("Если вы хотите завершить покупки и перейти в корзину напишите \"купить\"");

                String answer = scan.nextLine().trim();

                if (answer.equalsIgnoreCase("продуктовый")) {
                    for (Product products : Arrays.asList(cat1.name)) {
                        System.out.println(products);

                    }
                    System.out.println("Выберите товары, которые хотите добавить в корзину: ");
                    while (true) {
                        String answer2 = scan.nextLine().trim();
                        System.out.println("Выберите еще или если хотите вернуться к выбору категории напишите\"назад\"");
                        if (answer2.equalsIgnoreCase("назад")) {

                            break;
                        }
                        for (int i = 0; i < name1.length; i++) {
                            if (name1[i].name.equalsIgnoreCase(answer2)) {
                                basket.addProduct(name1[i]);

                            }
                        }
                    }


                } else if (answer.equalsIgnoreCase("электроника")) {
                    for (Product products : Arrays.asList(cat2.name)) {
                        System.out.println(products);
                    }
                    System.out.println("Выберите товары, которые хотите добавить в корзину: ");
                    while (true) {
                        String answer2 = scan.nextLine();
                        System.out.println("Выберите еще, или если хотите вернуться к выбору категории напишите\"назад\"");
                        if (answer2.equalsIgnoreCase("назад")) {

                            break;
                        }

                        for (int i = 0; i < name2.length; i++) {
                            if (name2[i].name.equalsIgnoreCase(answer2)) {
                                basket.addProduct(name2[i]);

                            }
                        }

                    }
                } else if (answer.equalsIgnoreCase("канцелярия")) {
                    for (Product products : Arrays.asList(cat3.name)) {
                        System.out.println(products);
                    }
                    System.out.println("Выберите товары, которые хотите добавить в корзину: ");
                    while (true) {
                        String answer2 = scan.nextLine();
                        System.out.println("Выберите еще, или если хотите вернуться к выбору категории напишите\"назад\"");
                        if (answer2.equalsIgnoreCase("назад")) {

                            break;
                        }
                        for (int i = 0; i < name3.length; i++) {
                            if (name3[i].name.equalsIgnoreCase(answer2)) {
                                basket.addProduct(name3[i]);

                            }
                        }
                    }

                } else if (answer.equalsIgnoreCase("купить")) {
                    basket.printBasket();
                    break;
                } else {
                    System.out.println("Вы ввели неправильное название отдела!");
                }

            }


        }


    }
}