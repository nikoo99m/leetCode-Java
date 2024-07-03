//A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:
//
// The area of the rectangular web page you designed must equal to the given target area.
// The width W should not be larger than the length L, which means L >= W.
// The difference between length L and width W should be as small as possible.
// Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.

public class constructTheRectangle {
    public int[] constructRectangle(int area) {
        int[] outPut = {0, 0};
        int minDifference = Integer.MAX_VALUE;

        for (int i = 1; i <= area; i++) {
            if (area % i == 0) {
                int j = area / i;
                int difference = Math.abs(i - j);

                if (difference < minDifference) {
                    outPut[0] = i;
                    outPut[1] = j;
                    minDifference = difference;
                }
            }

        }
        return outPut;
    }
    public static void main(String[] args) {
        constructTheRectangle solution = new constructTheRectangle();

        // Test cases
        int area1 = 20;
        int[] result1 = solution.constructRectangle(area1);
        System.out.println("Area: " + area1 + " -> Length: " + result1[0] + ", Width: " + result1[1]);

        int area2 = 17;
        int[] result2 = solution.constructRectangle(area2);
        System.out.println("Area: " + area2 + " -> Length: " + result2[0] + ", Width: " + result2[1]);

        int area3 = 24;
        int[] result3 = solution.constructRectangle(area3);
        System.out.println("Area: " + area3 + " -> Length: " + result3[0] + ", Width: " + result3[1]);
    }}
