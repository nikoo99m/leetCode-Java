
//Given two binary strings a and b, return their sum as a binary string.
public class AddBinary {
    public String addBinary(String a, String b) {

        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        if (intA == 0 && intB == 0){
            return "0";
        }


        String sum = "";
        int carry = 0;

        while (intA > 0 || intB > 0 || carry > 0) {
            int digitA = intA % 10;
            int digitB = intB % 10;
            int digSum = digitA + digitB + carry;


            if (digSum > 1) {
                carry = 1;
                digSum = digSum % 2;
            } else {
                carry = 0;
            }


            sum = digSum + sum;


            intA = intA / 10;
            intB = intB / 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        AddBinary binaryAddition = new AddBinary();

        // Example 1: Adding binary "101" and "110"
        String a1 = "101";
        String b1 = "110";
        String result1 = binaryAddition.addBinary(a1, b1);
        System.out.println(a1 + " + " + b1 + " = " + result1); // Output: 101 + 110 = 1011

        // Example 2: Adding binary "1111" and "1"
        String a2 = "0";
        String b2 = "0";
        String result2 = binaryAddition.addBinary(a2, b2);
        System.out.println(a2 + " + " + b2 + " = " + result2); // Output: 1111 + 1 = 10000
    }
}
