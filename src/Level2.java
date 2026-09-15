public class Level2 {

    void main(){
        // DEL A
        /*
        //opgave 2.3
        greet("Naya");
        greet("Sebastian");

        //opgave 2.7
        shout("this is important!");

        //DEL B

        //2.14
        printNumber(5+3);
        printNumber(10*2);
        printNumber(100/4);

        //DEL C

        //2.17
        printFullName("Naya", "Schwartz");

        //2.23
        printCoordinates(4,2);

        //DEL D
        //2.25,26
        printIfPositive(7);

        //2.31
        printLarger(5,5);

        //DEL E
        //2.34


    */

    }

    void greet(String name){
        System.out.println("Hello, " + name + "!");
    }
    void shout(String text){
        System.out.println(text.toUpperCase());
    }

    void printNumber(int number){
        System.out.println("Number: " + number);
    }
    void printFullName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    void printCoordinates(int x, int y){ System.out.println("(" + x + "," + y + ")");}

    void printIfPositive(int number){
        if (number % 2 ==0 && number > 0){
            System.out.println(number);
        }
    }

    void printLarger(int a, int b){
        if (a > b){
            System.out.println(a);
        } else if (a < b){
            System.out.println(b);
        } else if (a == b){
            System.out.println("they are equal");
        }
    }

    void printChar(char c, int count){

    }


}
