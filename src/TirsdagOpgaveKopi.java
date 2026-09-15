import java.util.Scanner;

public class TirsdagOpgaveKopi {
    Scanner scanner = new Scanner(System.in);

    void main() {

        printFormattedtext("   WORKSHOP REGISTRATION");

        // ---- Participant 1 ----
        printDivider();                                        // void metode 'printDivider'
        String name1 = getName();                              //getName? Huske at gemme navn, mail osv i variable ogs
        String email1 = getEmail();
        int age1 = getAge();
        String category1 = getCategory(age1);                                               //getCategory? refering to getAge?

        printParticipantProfile(name1,email1,age1,category1);

        // ---- Participant 2 ----
        printDivider();
        String name2 = getName();
        String email2 = getEmail();
        int age2 = getAge();
        String category2 = getCategory(age2);                                               //getCategory? refering to getAge?

        printParticipantProfile(name2,email2,age2,category2);

        // ---- Summary ----
        int totalAge = age1 + age2;                                     //printSummary?
        double averageAge = totalAge / 2.0;

        printFormattedtext("   SUMMARY");
        System.out.println("Participants: 2");
        System.out.println("Average age:  " + averageAge);
        printDoubleLine();

        scanner.close();
    }


    void printDivider() {
        System.out.println("--------------------------------");
    }

    void printFormattedtext(String text){
        printDoubleLine();
        System.out.println(text);
        printDoubleLine();
    }
    void printDoubleLine(){
        System.out.println("==============================");
    }

    String getName(){
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        return name;
    }
    String getEmail() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        return email;
    }
    int getAge(){
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        return age;
    }
    String getCategory(int age){
        String category;
        if (age < 18) {
            category = "Youth";
        } else if (age <= 65) {
            category = "Adult";
        } else {
            category = "Senior";
        }
        return category;
    }

    void printParticipantProfile(String name, String email, int age, String category){
        printDivider();
        System.out.println("Name:     " + name);
        System.out.println("Email:    " + email);
        System.out.println("Age:      " + age);
        System.out.println("Category: " + category);
        printDivider();
    }
}
