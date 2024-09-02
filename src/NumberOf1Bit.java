public class NumberOf1Bit {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOf1Bit hw = new NumberOf1Bit();
        int n = 11;
        int result = hw.hammingWeight(n);
        System.out.println("The number of set bits in " + n + " is: " + result);
    }
}