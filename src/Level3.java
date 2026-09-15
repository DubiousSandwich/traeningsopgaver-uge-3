public class Level3 {
    int a = 10;
    int b = 3;

    int[] numbers = {5,10,15,20,25};

    int age = 20;

    void main(){
        //del a
        //3.1
        /*
        int number = getNumber();
        System.out.println(number);

        //3.8
        String appName = getName();
        int version = getVersion();
        String author = getAuthor();
        System.out.println(appName + ", " + version + ", " + author);
        */

        //del b
        //3.9
        /*
        int number = getTen();
        System.out.println("This is a number: " + number);
        System.out.println("I mean it, it is really a number: " + number);

        //3.16
        double price = getPrice();
        double tax = price*0.25;
        double total = price + tax;
        System.out.println(price);
        System.out.println(tax);
        System.out.println(total);
        */

        //del c
        /*
        //3.17
        System.out.println(getSum());

        //3.24
        System.out.println(getFirst());
        System.out.println(getLast());
        */

        //del d
        //3.25
        boolean adult = isAdult();
        System.out.println("Is adult: " + adult);


    }

    int getNumber(){
        return 42;
    }
    String getName(){
        return "My App";
    }
    int getVersion(){
        return 1;
    }
    String getAuthor(){
        return "Anna";
    }
    int getTen(){
        return 10;
    }
    double getPrice(){
        return 80.0;
    }
    int getSum(){
        return a + b;
    }
    int getFirst(){
        return numbers[0];
    }
    int getLast(){
        return numbers[numbers.length-1];
    }
    boolean isAdult(){
        if (age >=18){
            return true;
        } else {
            return false;
        }
    }

}
