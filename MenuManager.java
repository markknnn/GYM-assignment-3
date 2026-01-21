package menu;

import exception.InvalidInputException;
import model.Member;
import model.Person;
import model.Trainer;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager implements Menu {

    private final ArrayList<Person> people = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMenu() {
        System.out.println("\n=== GYM SYSTEM ===");
        System.out.println("1. Add Member");
        System.out.println("2. Add Trainer");
        System.out.println("3. View All");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
    }

    @Override
    public void run() {
        boolean running = true;

        while (running) {
            displayMenu();

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> addMember();
                    case 2 -> addTrainer();
                    case 3 -> viewAll();
                    case 0 -> running = false;
                    default -> throw new InvalidInputException("Invalid menu choice: " + choice);
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a number.");
            } catch (IllegalArgumentException | InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private void addMember() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Membership type: ");
        String type = scanner.nextLine();

        people.add(new Member(id, name, age, type));
        System.out.println("Member added!");
    }

    private void addTrainer() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Specialization: ");
        String spec = scanner.nextLine();

        people.add(new Trainer(id, name, age, spec));
        System.out.println("Trainer added!");
    }

    private void viewAll() {
        if (people.isEmpty()) {
            System.out.println("No people added yet.");
            return;
        }
        for (Person p : people) {
            System.out.println(p);
            p.work();
        }
    }
}
