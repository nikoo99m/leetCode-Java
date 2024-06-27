import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindCenterOfStarGraph {
            public static int findCenter(int[][] edges) {
                // Extract the nodes from the first two edges
                int u1 = edges[0][0];
                int v1 = edges[0][1];
                int u2 = edges[1][0];
                int v2 = edges[1][1];

                // Determine the common node
                if (u1 == u2 || u1 == v2) {
                    return u1;
                } else {
                    return v1;
                }
            }

            public static void main(String[] args) {
                int[][] edges = {{1, 2}, {2, 3}, {4, 2}, {7,2}, {2, 10}};
                System.out.println(findCenter(edges));
            }
        }


