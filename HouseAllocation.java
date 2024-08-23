import java.util.Arrays;
import java.util.Scanner;

public class HouseAllocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        
        int[] desiredSizes = new int[N];
        for (int i = 0; i < N; i++) {
            desiredSizes[i] = scanner.nextInt();
        }
        
        int[] houseSizes = new int[M];
        for (int i = 0; i < M; i++) {
            houseSizes[i] = scanner.nextInt();
        }
        
        Arrays.sort(desiredSizes);
        Arrays.sort(houseSizes);
        
        int i = 0, j = 0, matches = 0;
        
        while (i < N && j < M) {
            if (houseSizes[j] >= desiredSizes[i] - K && houseSizes[j] <= desiredSizes[i] + K) {
                matches++;
                i++;
                j++;
            } else if (houseSizes[j] < desiredSizes[i] - K) {
                j++;
            } else {
                i++;
            }
        }
        
        System.out.println(matches);
        
        scanner.close();
    }
}
// can we solve it with stream api

 // Sort arrays using Stream API
 desiredSizes = Arrays.stream(desiredSizes).sorted().toArray();
 houseSizes = Arrays.stream(houseSizes).sorted().toArray();
 
 int matches = (int) Arrays.stream(desiredSizes)
     .flatMap(desiredSize -> Arrays.stream(houseSizes)
         .filter(houseSize -> houseSize >= desiredSize - K && houseSize <= desiredSize + K)
         .limit(1))  // We take only the first match
     .count();

 System.out.println(matches);