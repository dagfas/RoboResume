package com.dagmfasil;

import java.util.ArrayList;
import java.util.Scanner;

public class Education {

        static ArrayList<String>university = new ArrayList<>();
        static ArrayList<String>year = new ArrayList<>();
        static ArrayList<String> major = new ArrayList<>();
        static ArrayList<Integer>counterSaver1 = new ArrayList<>();



        static String response;
        static Scanner scanner = new Scanner(System.in);
        static int educationCounter = 0;


        public static void generateEducation(){

            educationCounter=0;

            do{
                System.out.println("Education");
                System.out.println("Major:");
                response = scanner.nextLine();
                major.add(response);
                System.out.println("School:");
                response = scanner.nextLine();
                university.add(response);
                System.out.println("Years attended:");
                response = scanner.nextLine();
                year.add(response);
                educationCounter++;
                System.out.println("Do you want to add more to your education? Enter(yes|no)");
                String choice;
                choice=scanner.nextLine();
                if((choice.equalsIgnoreCase("yes"))){

                }
                else{
                    counterSaver1.add(educationCounter);
                    break;
                }
            } while (true);

        }


        public static ArrayList<String> getDescription() {
            return description;
        }

        public static void setDescription(ArrayList<String> description) {
            Education.description = description;
        }

        public static ArrayList<String>description=new ArrayList<>();

        public static ArrayList<String> getMajor() {
            return major;
        }

        public static void setMajor(ArrayList<String> major) {
            Education.major = major;
        }

        public static ArrayList<String> getUniversity() {
            return university;
        }

        public static void setUniversity(ArrayList<String> university) {
            Education.university = university;
        }

        public static ArrayList<String> getYear() {
            return year;
        }

        public static void setYear(ArrayList<String> year) {
            Education.year = year;
        }


    }

