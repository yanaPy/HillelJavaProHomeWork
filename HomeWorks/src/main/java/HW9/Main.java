package HW9;

import HW7.Collection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CustomCollection collection = new CustomCollectionService();
        collection.add("A");
        collection.add("B");
        collection.add("C");


        String[] array = new String[]{"A", "B", null, "C"};
        Collection collectionNext = new Collection(array);

        while (true) {
            System.out.println("Choose number for operations :");
            System.out.println("1 - add(String str)");
            System.out.println("2 - addAll(Collection strColl)");
            System.out.println("3 - delete(int index)");
            System.out.println("4 - delete(String str)");
            System.out.println("5 - get(int index)");
            System.out.println("6 - contains(String str)");
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
                collection.addAll(collectionNext);
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
                System.out.println("Enter value ");
                String value = input.nextLine();
                System.out.println("Success contain: " + collection.contains(value));
            } else if (choice == 7) {
                collection.clear();
                System.out.println(collection);
            } else if (choice == 8) {
                System.out.println("Size:" + collection.size());
            } else if (choice == 9) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
