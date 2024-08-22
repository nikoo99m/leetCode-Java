//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
public class AddDigits {
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();


        int num1 = 38;
        int result1 = addDigits.addDigits(num1);
        System.out.println("The digital root of " + num1 + " is: " + result1);

        int num2 = 123;
        int result2 = addDigits.addDigits(num2);
        System.out.println("The digital root of " + num2 + " is: " + result2);

        int num3 = 0;
        int result3 = addDigits.addDigits(num3);
        System.out.println("The digital root of " + num3 + " is: " + result3);

        int num4 = 9;
        int result4 = addDigits.addDigits(num4);
        System.out.println("The digital root of " + num4 + " is: " + result4);
    }
}



