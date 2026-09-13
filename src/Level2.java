public class Level2 {

    void main(){
        // DEL A

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

}
