package com.dagmfasil;

import java.util.ArrayList;
import java.util.Scanner;


public class Experience {

    static ArrayList<String> title = new ArrayList<>();
    static ArrayList<String> company = new ArrayList<>();
    static ArrayList<String> date = new ArrayList<>();
    static ArrayList<String> description = new ArrayList<>();
    static ArrayList<Integer> counterSaver2 = new ArrayList<>();


    static String response;
    static Scanner scanner = new Scanner(System.in);
    static int experienceCounter = 0;

    public static ArrayList<String> getTitle() {
        return title;
    }

    public static void setTitle(ArrayList<String> title) {
        Experience.title = title;
    }

    public static ArrayList<String> getCompany() {
        return company;
    }

    public static void setCompany(ArrayList<String> company) {
        Experience.company = company;
    }

    public static ArrayList<String> getDate() {
        return date;
    }

    public static void setDate(ArrayList<String> date) {
        Experience.date = date;
    }

    public static ArrayList<String> getDescription() {
        return description;
    }

    public static void setDescription(ArrayList<String> description) {
        Experience.description = description;
    }

    public static void generateExperience() {
        experienceCounter = 0;

        do {
            System.out.println("Experience");
            System.out.println("Position:");
            response = scanner.nextLine();
            title.add(response);
            System.out.println("Company:");
            response = scanner.nextLine();
            company.add(response);
            System.out.println("Date:");
            response = scanner.nextLine();
            date.add(response);
            System.out.println("Description:");
            response = scanner.nextLine();
            description.add(response);
            experienceCounter++;

            System.out.println("Do you want to add more work experience? (yes|no)");
            String choice;
            choice = scanner.nextLine();
            if ((choice.equalsIgnoreCase("yes"))) {
            } else {
                counterSaver2.add(experienceCounter);
                break;
            }
        } while (true);
    }
}
