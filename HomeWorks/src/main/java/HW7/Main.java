package HW7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Collection collection = new Collection();

        while (true) {
            System.out.println("Choose number for operations :");
            System.out.println("1 - add(int index, String value)");
            System.out.println("2 - add(String value)");
            System.out.println("3 - delete(int index)");
            System.out.println("4 - delete(String value)");
            System.out.println("5 - get(int index)");
            System.out.println("6 - exit.");

            Scanner i = new Scanner(System.in);
            int choice = i.nextInt();

            Scanner input = new Scanner(System.in);

            if (choice == 1) {
                System.out.println("Enter index ");
                int index = input.nextInt();

                System.out.println("Enter value ");
                Scanner input2 = new Scanner(System.in);
                String value = input2.nextLine();

                collection.add(index,value);
                System.out.println(collection);
            } else if (choice == 2) {
                System.out.println("Enter value ");
                String value = input.nextLine();
                collection.add(value);
                System.out.println(collection);
            } else if (choice == 3) {
                System.out.println("Enter index ");
                int index = input.nextInt();
                collection.delete(index);
                System.out.println(collection);
            } else if (choice == 4) {
                System.out.println("Enter value ");
                String value = input.nextLine();
                collection.delete(value);
                System.out.println(collection);
            } else if (choice == 5) {
                System.out.println("Enter index ");
                int index = input.nextInt();
                collection.get(index);
                System.out.println(collection);
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

    }

}
