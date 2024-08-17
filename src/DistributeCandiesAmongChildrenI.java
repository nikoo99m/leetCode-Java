//You are given two positive integers n and limit.
//
//Return the total number of ways to distribute n candies among 3 children such that no child gets more than limit candies.
public class DistributeCandiesAmongChildrenI {
    public static int distributeCandies(int n, int limit) {
            int count = 0;

            for (int i = 0; i <= Math.min(n, limit); i++) {

                for (int j = 0; j <= Math.min(n - i, limit); j++) {

                    int k = n - i - j;

                    if (k <= limit) {
                        count++;
                    }
                }
            }

            return count;
        }
        public static void main(String[] args) {
            int n = 7;
            int limit = 3;

            int result = distributeCandies(n, limit);
            System.out.println("Total number of ways: " + result);
        }
    }


