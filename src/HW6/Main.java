package HW6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SubscriberServiceImpl service = new SubscriberServiceImpl();
        Subscriber[] subscribers = {
                new Subscriber(1, "Ivanov", "Ivan", "Ivanovich", "Dnipro",
                        "+380603423456", "NUM001", 130.5, 2678, 2345,
                        256),
                new Subscriber(2, "Ivanova", "Ivanna", "Ivanovna", "Dnipro",
                "+380343423456", "NUM002", 456.5, 6678, 7345,
                8856),
                new Subscriber(3, "Kuznezov", "Ivan", "Ivanovich", "Dnipro",
                "+380673423000", "NUM003", -4221.5, 8678, 0,
                9000),
                new Subscriber(4, "Kuznezova", "Ivanna", "Ivanovna", "Kyiv",
                "+380673423000", "NUM004", 456221.5, 0, 5678,
                50),
                new Subscriber(5, "Zavernoe", "Zlata", "Ivanovna", "Kyiv",
                "+380223423000", "NUM005", -12.3, 0, 0,
                100)
        };

        while (true) {
            System.out.println("Choose number for print :");
            System.out.println("1 - information about subscribers whose time of intra city calls exceeds.");
            System.out.println("2 - information about subscribers who used long-distance communication.");
            System.out.println("3 - information about subscribers in which the first letter of the surname starts with " +
                    "input character.");
            System.out.println("4 - total consumption of Internet traffic for city");
            System.out.println("5 - number of subscribers with negative balance.");
            System.out.println("6 - exit.");

            Scanner i = new Scanner(System.in);
            int choice = i.nextInt();

            Scanner input = new Scanner(System.in);

            if (choice == 1) {
                System.out.println("Enter time ");
                double time = input.nextDouble();
                service.subsInfoCityTimeCallsExceedsSpecified(subscribers, time);
            } else if (choice == 2) {
                service.subsInfoWhoUsedLongDistanceCommunication(subscribers);
            } else if (choice == 3) {
                System.out.println("Enter first letter of the surname ");
                String letter = input.nextLine();
                service.subsInfo(subscribers,letter);
            } else if (choice == 4) {
                service.numberSubsWithNegativeBalance(subscribers);
            } else if (choice == 5) {
                System.out.println("Enter city ");
                String city = input.nextLine();
                service.totalConsumptionInetTrafficForCity(subscribers, city);
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
