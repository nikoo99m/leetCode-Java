//Given an array nums of integers, return how many of them contain an even number of digits.


public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int  i = 0; i < nums.length ; i++){
            if (numberDigits(nums[i]) % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
    public int numberDigits(int num){
        int count = 0;
        if (num == 0){
            return 1;
        }
        while (num >= 1){
            num /= 10;
            count++ ;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {12, 345, 1, 6432, 45566, 0};
        FindNumbersWithEvenNumberOfDigits object = new FindNumbersWithEvenNumberOfDigits();
        int ans = object.findNumbers(array);
        System.out.println(ans);

    }
}

