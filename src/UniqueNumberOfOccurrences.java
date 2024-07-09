import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
        public static boolean uniqueOccurrences(int[] arr) {

            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            Set<Integer> frequencySet = new HashSet<>();
            for (int frequency : frequencyMap.values()) {
                if (!frequencySet.add(frequency)) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 2, 1, 1, 3};
            System.out.println(uniqueOccurrences(arr1));

            int[] arr2 = {1, 2, 2, 1, 1, 2};
            System.out.println(uniqueOccurrences(arr2));
        }
    }

