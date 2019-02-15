package com.dagmfasil;

import java.util.ArrayList;
import java.util.Scanner;

    public class Skills {
    static int skillCounter = 0;
    static String response;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> skillT = new ArrayList<>();
    static ArrayList<String> rating = new ArrayList<>();
    static ArrayList<Integer> counterSaver3 = new ArrayList<>();


    public static void generateSkills() {
        skillCounter = 0;

        do {
            System.out.println("Enter a Skill: ");
            response = scanner.nextLine();
            skillT.add(response);

            printSelections();

            String levelChoice = scanner.nextLine();
            String expertise;
            switch (levelChoice) {
                case "1":
                    expertise = "Novice";
                    break;
                case "2":
                    expertise = "Fundamental";
                    break;
                case "3":
                    expertise = "Intermediate";
                    break;
                case "4":
                    expertise = "Advanced";
                    break;
                case "5":
                    expertise = "Expert";
                    break;
                default:
                    expertise = scanner.nextLine();
            }
            rating.add(expertise);
            skillCounter++;
            System.out.println("Do you want to add more skills? Enter(yes|no)");
            String choice;
            choice = scanner.nextLine();
            if ((choice.equalsIgnoreCase("yes"))) {
            } else {
                counterSaver3.add(skillCounter);
                break;
            }
        } while (true);
    }

    public static void printSelections() {
        System.out.println("\nChoose your level of expertise:\npress");
        System.out.println("1 - Novice\n" +
                "2 - Fundamental\n" +
                "3 - Intermediate\n" +
                "4 - Advanced\n" +
                "5 - Expert");

        System.out.println("Choose your action: ");
    }


}
