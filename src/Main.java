
public class Main {

    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        print(sum(input1, input2));

        //test with other values
        number = 0;
        input1 = -3;
        input2 = 100;
        name = "Jan-Willem";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        print(sum(input1, input2));
    }

    private static void hello() {
        print("Hello, World");
    }

    private static void positiveOrNegative(int number) {
        if (number >= 0) {
            print("This number is positive");
        } else {
            print("This number is negative");
        }
    }

    private static void positiveOrZeroOrNegative(int number) {
        if (number == 0) {
            print("This number is zero!");
        } else if (number > 0) {
            print("This number is positive!");
        } else {
            print("This number is negative!");
        }
    }

    private static void bartender(String name) {
        switch (name) {
            case "Jan":
                print("Cocktail A");
                break;
            case "Henk":
                print("Cocktail B");
                break;
            default:
                print("Cocktail C");
                break;
        }
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    //print any variable type to string
    private static void print(Object output) {
        System.out.println(output);

    }
}