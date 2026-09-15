import java.util.Scanner;

public class TirsdagOpgave {
    Scanner scanner = new Scanner(System.in);

    void main() {

        System.out.println("==============================");
        System.out.println("   WORKSHOP REGISTRATION");
        System.out.println("==============================");           //void metode 'printHeader'

        // ---- Participant 1 ----
        System.out.println("--------------------------------");         // void metode 'printDivider'
        System.out.print("Enter name: ");
        String name1 = scanner.nextLine();                              //getName? Huske at gemme navn, mail osv i variable ogs

        System.out.print("Enter email: ");                              //getMail?
        String email1 = scanner.nextLine();

        System.out.print("Enter age: ");                                //getAge?
        int age1 = Integer.parseInt(scanner.nextLine());

        String category1;                                               //getCategory? refering to getAge?
        if (age1 < 18) {
            category1 = "Youth";
        } else if (age1 < 65) {
            category1 = "Adult";
        } else {
            category1 = "Senior";
        }

        System.out.println("--------------------------------");         //printParticipantProfile
        System.out.println("Name:     " + name1);
        System.out.println("Email:    " + email1);
        System.out.println("Age:      " + age1);
        System.out.println("Category: " + category1);
        System.out.println("--------------------------------");

        // ---- Participant 2 ----
        System.out.println("--------------------------------");
        System.out.print("Enter name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter email: ");
        String email2 = scanner.nextLine();

        System.out.print("Enter age: ");
        int age2 = Integer.parseInt(scanner.nextLine());

        String category2;
        if (age2 < 18) {
            category2 = "Youth";
        } else if (age2 < 65) {
            category2 = "Adult";
        } else {
            category2 = "Senior";
        }

        System.out.println("--------------------------------");
        System.out.println("Name:     " + name2);
        System.out.println("Email:    " + email2);
        System.out.println("Age:      " + age2);
        System.out.println("Category: " + category2);
        System.out.println("--------------------------------");

        // ---- Summary ----
        int totalAge = age1 + age2;                                     //printSummary?
        double averageAge = totalAge / 2.0;

        System.out.println("==============================");
        System.out.println("   SUMMARY");
        System.out.println("==============================");
        System.out.println("Participants: 2");
        System.out.println("Average age:  " + averageAge);
        System.out.println("==============================");

        scanner.close();
    }
}
