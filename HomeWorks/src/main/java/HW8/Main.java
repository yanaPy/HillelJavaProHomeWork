package HW8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CollectionService collection = new CollectionService(4);
        CollectionService collectionNext = new CollectionService(4);


        while (true) {
            System.out.println("Choose number for operations :");
            System.out.println("1 - add(String o)");
            System.out.println("2 - add(int index, String o)");
            System.out.println("3 - delete (String o)");
            System.out.println("4 - get(int index)");
            System.out.println("5 - contain(String o)");
            System.out.println("6 - equals(Collection str)");
            System.out.println("7 - clear()");
            System.out.println("8 - size()");
            System.out.println("9 - exit.");


            Scanner i = new Scanner(System.in);
            int choice = i.nextInt();

            Scanner input = new Scanner(System.in);

            if (choice == 1) {
                System.out.println("Enter value ");
                String value = input.nextLine();

                collection.add(value);
                System.out.println(collection);
            } else if (choice == 2) {
                System.out.println("Enter index ");
                int index = input.nextInt();

                System.out.println("Enter value ");
                Scanner input2 = new Scanner(System.in);
                String value = input2.nextLine();

                collection.add(index, value);
                System.out.println(collection);
            } else if (choice == 3) {
                System.out.println("Enter value ");
                String value = input.nextLine();
                collection.delete(value);
                System.out.println(collection);
            } else if (choice == 4) {
                System.out.println("Enter index ");
                int index = input.nextInt();
                collection.get(index);
                System.out.println(collection);
            } else if (choice == 5) {
                System.out.println("Enter value ");
                String value = input.nextLine();

                System.out.println(collection.contain(value));
            } else if (choice == 6) {
                System.out.println(collection.equals(collectionNext));
            } else if (choice == 7) {
                collection.clear();
                System.out.println(collection);
            } else if (choice == 8) {
                System.out.println(collection.size());
            } else if (choice == 9) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }


    }

}
