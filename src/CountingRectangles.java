
public class CountingRectangles {
    public static void main(String[] args) {
        int targetValue = 2000000;
        int closestArea = 0;
        int minDifference = Integer.MAX_VALUE;

        for (int m = 1; m <= 80; m++) {
            for (int n = 1; n <= 80; n++) {
                int numRectangles = (m * (m + 1) / 2) * (n * (n + 1) / 2);
                int difference = Math.abs(targetValue - numRectangles);
                if (difference < minDifference) {
                    minDifference = difference;
                    closestArea = m * n;
                }
            }
        }
        System.out.println("The area is: " + closestArea);
    }
}


