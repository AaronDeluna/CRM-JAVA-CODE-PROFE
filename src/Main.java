import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {

            menu();

            int actionNumber = scanner.nextInt();

            switch (actionNumber) {
                case 1 -> System.out.println("Взаимодействие с клиентами");
                case 2 -> System.out.println("Взаимодействие с задачами");
                case 3 -> System.out.println("Взаимодействие со сделками");
                case 4 -> System.out.println("Взаимодействие с аналитикой");
                case 0 -> {
                    System.out.println("Зря вышел пидр");
                    flag = false;
                }
                default -> System.out.println("Епать ты косой");
            }
        }
    }

    static void menu() {
        System.out.println("Выберите пункт меню.");
        System.out.println("1. Клиенты");
        System.out.println("2. Задачи");
        System.out.println("3. Сделка");
        System.out.println("4. Аналитика");
        System.out.println("0. Выход");
    }
}