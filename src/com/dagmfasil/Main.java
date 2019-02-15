package com.dagmfasil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String response;

    public static void main(String[] args) {

        boolean quit = false;

        while (!quit) {

            String selection;

            printSelections();

            selection = scanner.nextLine();

            switch (selection) {
                case "1":
                    createResume();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    printSelections();
                    break;
            }

        }


    }


    public static void printSelections() {
        System.out.println("\nAvailable selections:\npress");
        System.out.println("1 - to create resume\n" +
                  "2 - to display resume\n" +
                  "3 - to print a list of available actions");

        System.out.print("Choose your action: ");
    }

    public static void createResume() {
        while (true) {
            System.out.println("Please enter your name:");
            response = scanner.nextLine();
            name.add(response);
            System.out.println("Email: ");
            response = scanner.nextLine();
            email.add(response);
            System.out.println("Phone: ");
            response = scanner.nextLine();
            phone.add(response);
            Education.generateEducation();

            Experience.generateExperience();

            Skills.generateSkills();

            System.out.println("Thank you for adding your resume!");
        }

    }

    public static void display() {
        if (name.size() <= 0) {
            System.out.println("No resume found");
        } else {
            for (int i = 0; i < name.size(); i++) {
                System.out.println("Name: " + name.get(i));
                System.out.println("Email: " + email.get(i));
                System.out.println("Phone: " + phone.get(i));


                System.out.println("Education");
                for (int j = 0; j < Education.counterSaver1.get(i); j++) {
                    System.out.println("B.S in " + Education.major.get(j));
                    System.out.println("School: " + Education.university.get(j));
                    System.out.println("Graduation year: " + Education.year.get(j));
                }

                System.out.println("Work Experience:");
                for (int k = 0; k < Experience.counterSaver2.get(i); k++) {
                    System.out.println("Position: " + Experience.title.get(k));
                    System.out.println("Company: " + Experience.company.get(k));
                    System.out.println("Dates worked: " + Experience.date.get(k));
                    System.out.println("Description: " + Experience.description.get(k));
                }


                System.out.println("Skills:");
                for (int l = 0; l < Skills.counterSaver3.get(i); l++) {
                    System.out.println(Skills.skillT.get(l) + "," + Skills.rating.get(l));
                }
            }
        }
    }


    public static void exit() {
        System.exit(0);
    }


    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> email = new ArrayList<>();
    static ArrayList<String> phone = new ArrayList<>();
    static ArrayList<Education> education = new ArrayList<Education>();
    static ArrayList<Experience> experience = new ArrayList<Experience>();

    public static ArrayList<String> getName() {
        return name;
    }

    public static void setName(ArrayList<String> userName) {
        name = userName;
    }

    public static ArrayList<String> getEmail() {
        return email;
    }

    public static void setEmail(ArrayList<String> userEmail) {
        email = userEmail;
    }

    public static ArrayList<Education> getEducation() {
        return education;
    }

    public static void setEducations(ArrayList<Education> education) {
        education = education;
    }

    public static ArrayList<Experience> getExperience() {
        return experience;
    }

    public static void setExperience(ArrayList<Experience> userExperience) {
        experience = userExperience;
    }
}

