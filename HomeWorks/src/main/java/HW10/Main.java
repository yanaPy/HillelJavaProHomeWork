package HW10;

import HW8.CollectionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Object> arr = new ArrayList();
        arr.add("q");
        arr.add("w");
        arr.add("e");
        arr.add("r");
        arr.add("q");
        arr.add("t");
        arr.add("y");

        CollectionService collection = new CollectionService(1);
        collection.add("q");
        collection.add("w");
        collection.add("e");
        collection.add("r");
        collection.add("q");


        while (true) {
            System.out.println("Choose number for operations :");
            System.out.println("1 - remove duplicates");
            System.out.println("2 - iterate collection");
            System.out.println("3 - calculate the roots of a quadratic equation");
            System.out.println("4 - exit");

            Scanner i = new Scanner(System.in);
            int choice = i.nextInt();

            Scanner input = new Scanner(System.in);

            if (choice == 1) {
                System.out.println(RemoveDuplicates.removeDuplicates(arr));
            } else if (choice == 2) {
                System.out.println(collection);

                Iterator iterator = new Iterator(collection);

                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            } else if (choice == 3) {
                System.out.println("Enter a ");
                int a = input.nextInt();

                System.out.println("Enter b ");
                int b = input.nextInt();

                System.out.println("Enter c ");
                int c = input.nextInt();

                QuadraticEquation.calc(a, b, c);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }


        }


    }
}
