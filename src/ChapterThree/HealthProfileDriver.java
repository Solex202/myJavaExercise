package ChapterThree;

import java.util.Scanner;

public class HealthProfileDriver {


    public static void main(String[] args) {
        HealthProfile healthProfile = new HealthProfile("oladeji","abioye","female",22,03,1994,67,6.5643);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter patient's first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter patient's last name:");
        String lastName = scan.nextLine();
        System.out.println("Enter patient's gender:");
        String gender = scan.nextLine();
        System.out.println("Enter day of birth:");
        int dob = scan.nextInt();
        System.out.println("Enter month of birth:");
        int mob = scan.nextInt();
        System.out.println("Enter year of birth:");
        int yob = scan.nextInt();
        System.out.println("Enter height in inches:");
        int height = scan.nextInt();
        System.out.println("Enter weight in pounds:");
        double weight = scan.nextInt();

        healthProfile.setFirstName(firstName);
        healthProfile.setLastName(lastName);
        healthProfile.setGender(gender);
        healthProfile.setDayOfBirth(dob);
        healthProfile.setMonthOfBirth(mob);
        healthProfile.setYearOfBirth(yob);
        healthProfile.setHeight(height);
        healthProfile.setWeightInPounds(weight);


        System.out.printf("First name is %s%n", healthProfile.getFirstName());
        System.out.printf("Last name is %s%n", healthProfile.getLastName());
        System.out.printf("%s%n", healthProfile.getGender());
        System.out.printf("Day of birth is %d%n", healthProfile.getDayOfBirth());
        System.out.printf("Month of birth is %d%n", healthProfile.getMonthOfBirth());
        System.out.printf("Year of birth is %d%n", healthProfile.getYearOfBirth());
        System.out.printf("Patient's height is %d%n", healthProfile.getHeight()) ;
        System.out.printf("Patient's weight in pounds is %.4f%n", healthProfile.getWeightInPounds());
        System.out.printf("Present age is %d%n", healthProfile.getAgeInYears());
        System.out.printf("Maximum heart rate is %d%n", healthProfile.getMaximumHeartRate());
        System.out.printf("Target heart rate is %s%n", healthProfile.getTargetHeartRate());
        System.out.printf("BMI is %.3f%n", healthProfile.getBodyMassIndex());

    }
}
