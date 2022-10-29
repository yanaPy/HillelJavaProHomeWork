package HW5;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        StudentsService service = new StudentsService();

        service.setStudent(new Student(1, "Ivanov", "Ivan", "1990", "maths",
                "1", "K"));
        service.setStudent(new Student(2, "Ivanova", "Ivanna", "1991", "maths",
                "2", "K"));
        service.setStudent(new Student(3, "Kuznezov", "Ian", "1995", "philology",
                "2", "A"));
        service.setStudent(new Student(4, "Login", "Lelia", "1994", "philology",
                "4", "W"));
        service.setStudent(new Student(5, "Login", "Jhon", "1992", "philosophy",
                "4", "W"));
        service.setStudent(new Student(6, "Arbuz", "Ivan", "1992", "philosophy",
                "1", "E"));
        service.setStudent(new Student(7, "Romashka", "Roman", "1992", "maths",
                "3", "U"));
        service.setStudent(new Student(8, "Romashka", "Irina", "1996", "maths",
                "1", "A"));
        service.setStudent(new Student(9, "Koshik", "Ivan", "1991", "ui. Ilala 12/122",
                "+380673423456", "maths", "2", "D"));
        service.setStudent(new Student(10, "Zavernoe", "Gennadi", "Gennadievich",
                "1991", "ui. Ilala 12/122", "+380673423456", "philosophy", "2",
                "S"));


        while (true) {
            System.out.println("Choose number of type of filter :");
            System.out.println("1 - filter students by faculty.");
            System.out.println("2 - filter students by faculty and course.");
            System.out.println("3 - filter students by year of birth.");
            System.out.println("4 - filter students by group.");
            System.out.println("5 - print all students.");
            System.out.println("6 - exit.");

            Scanner i = new Scanner(System.in);
            int choice = i.nextInt();

            Scanner input = new Scanner(System.in);

            if (choice == 1) {
                System.out.println("Enter faculty for search ");
                String faculty = input.nextLine();
                service.filterByFaculty(faculty);
            } else if (choice == 2) {
                System.out.println("Enter faculty for search ");
                String faculty = input.nextLine();
                System.out.println("Enter course for search ");
                String course = input.nextLine();
                service.filterByFacultyAndCourse(faculty, course);
            } else if (choice == 3) {
                System.out.println("Enter year of birth for search ");
                String year = input.nextLine();
                service.filterByYearBirth(year);
            } else if (choice == 4) {
                System.out.println("Enter group for search ");
                String group = input.nextLine();
                service.filterByGroup(group);
            } else if (choice == 5) {
                System.out.println("All students :\n" + service);
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

}
