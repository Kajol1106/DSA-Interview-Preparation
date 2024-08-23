import java.util.Scanner;
import java.util.Arrays;

public class LumberjackBob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of trees and the required wood amount
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Reading the heights of the trees
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        // Use binary search to find the maximum height
        int low = 0;
        int high = Arrays.stream(heights).max().getAsInt();
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long wood = getWoodCollected(heights, mid);

            if (wood >= M) {
                result = mid; // Update the result to the current mid value
                low = mid + 1; // Try for a higher sawblade height
            } else {
                high = mid - 1; // Try for a lower sawblade height
            }
        }

        // Print the maximum height that allows Bob to collect at least M metres of wood
        System.out.println(result);

        scanner.close();
    }

    // Helper method to calculate the total wood collected if the sawblade is set at height H
    private static long getWoodCollected(int[] heights, int H) {
        long totalWood = 0;
        for (int height : heights) {
            if (height > H) {
                totalWood += height - H;
            }
        }
        return totalWood;
    }
}
\