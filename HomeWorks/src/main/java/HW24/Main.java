package HW24;


import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    @SneakyThrows
    public static void main(String[] args) {

        StudentServiceImpl studentService = new StudentServiceImpl();


        while (true) {

            System.out.println("Choose number for operations :");
            System.out.println("1 - add student");
            System.out.println("2 - get all student");
            System.out.println("3 - get student by name");
            System.out.println("4 - get student by id");
            System.out.println("5 - exit");

            Scanner i = new Scanner(System.in);
            int choice = i.nextInt();

            if (choice == 1) {
                studentService.addStudent();
            } else if (choice == 2) {
                studentService.getAll();
            } else if (choice == 3) {
                Scanner a = new Scanner(System.in);
                System.out.println("Enter student name");
                String name = a.nextLine();
                studentService.getByName(name);
            } else if (choice == 4) {
                List<Integer> ids = new ArrayList<>();
                while (true) {
                    System.out.println("Enter student id");

                    Scanner scanner1 = new Scanner(System.in);
                    String str = scanner1.nextLine();
//            int id = scanner.nextInt();

                    if (new Scanner(str).hasNextInt()) {
                        int id = Integer.parseInt(str);
                        ids.add(id);
                    } else {
                        System.out.println("Error! Only numbers available.");
                    }

                    System.out.println("You want to continue? Enter y/n");
                    String strNext = scanner1.nextLine();
                    if (strNext.equals("n")) break;
                }
                studentService.getByIds(ids);
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
