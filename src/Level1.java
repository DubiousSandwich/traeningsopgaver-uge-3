public class Level1 {
    String appName = "MyApp";
    String version = "1.0";

    String name = "Anna";
    int age = 25;
    String city = "Copenhagen";

    void main(){
    //del A
        /*
        //opgave 1.1
        printHello();

        //opgave 1.7
        printAppName();

    //del B
        //opgave 1.9
        printLine();
        printLine();
        printLine();

        //opgave 1.10
        printBox();

    //Del C
        //opgave 1.23
        for (int i = 1;i <= 10; i++){
            printBeep();
        }

        //opgave 1.24
        for (int i = 1; i<= 10; i++){
            if (i % 2 == 0){
                printGoodbye();
            } else printHello();
        }

    //del D
        //opgave 1.30
        printName();
        printAge();
        printCity();

        //opgave 1.32
        printReceiptHeader();
        System.out.println("ITEMS:\nTomato\nCoffee\nDeez");
        printThankYou();
        */

    //del E
        //opgave 1.35
        //printHeader();

        //opgave 1.36
       //printSection();

    //Del F
        //opgave 1.41
        showStartup();

    }

    void printHello(){
        System.out.println("Hello!");
    }
    void printGoodbye(){
        System.out.println("Goodbye :(");
    }

    void printAppName(){
        System.out.println(appName);
    }

    void printLine(){
        System.out.println("--------------------");
    }

    void printBox(){
        System.out.println("+-----+");
        System.out.println("|     |");
        System.out.println("+-----+");
    }

    void printBeep(){
        System.out.println("BEEP!");
    }

    void printName(){
        System.out.println(name);
    }
    void printAge(){
        System.out.println(age);
    }
    void printCity(){
        System.out.println(city);
    }

    void printReceiptHeader(){
        System.out.println("======== RECEIPT ========");
    }
    void printThankYou(){
        System.out.println("Thank you for your purchase ★");
    }

    void printDash(){
        System.out.print("-");
    }
    void printHeader(){
        for (int i = 1; i<=5;i++){
            printDash();
        }
        System.out.print("HEADER");
        for (int i = 1; i<=5;i++){
            printDash();
        }
    }

    void printDivider(){
        System.out.println("==============");
    }
    void printSpacing(){
        System.out.println();
    }
    void printSection(){
        printDivider();
        printSpacing();
        System.out.println("Content");
        printSpacing();
        printDivider();
    }

    void printWelcome(){
        System.out.println("Welcome to the app!");
    }
    void printAppInfo(){
        System.out.println(appName + " " + version);
    }
    void showStartup(){
        printDivider();
        printAppInfo();
        printDivider();
        printWelcome();
    }
}
