import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            
            sorting(n, arr);
            System.out.println();
        }
    }
    
    public static void sorting(int n, Integer[] arr) {
        Arrays.sort(arr, (a, b) -> {
            int sqr1 = (int)Math.sqrt(Math.abs(a));
            int sqr2 = (int)Math.sqrt(Math.abs(b));
            
            if(sqr1>sqr2) {
                return 1;
            }
            else if(sqr1==sqr2) {
                return a-b;
            }
            else {
                return -1;
            }
        });
        
        for(Integer i: arr) {
            System.out.print(i+" ");
        }
        
    }
}