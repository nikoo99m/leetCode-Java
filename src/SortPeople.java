import java.util.Map;

//You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
//
// For each index i, names[i] and heights[i] denote the name and height of the ith person.
//
// Return names sorted in descending order by the people's heights.

import java.util.Arrays;
import java.util.Comparator;

public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] sortedNames = new String[n];

        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            people[i] = new Person(names[i], heights[i]);
        }

     Arrays.sort(people, new Comparator<Person>() {
         @Override
         public int compare(Person o1, Person o2) {
             return o2.height - o1.height;
         }
     });

        for (int i = 0; i < n; i++) {
            sortedNames[i] = people[i].name;
        }

        return sortedNames;
    }

    class Person {
        String name;
        int height;

        Person(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        SortPeople sp = new SortPeople();

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] sortedNames = sp.sortPeople(names, heights);

        System.out.println("Sorted names by height in descending order: " + Arrays.toString(sortedNames));
    }
}
