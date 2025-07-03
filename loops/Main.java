
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Size of array
            int K = sc.nextInt(); // Target sum
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int result = countSubarraysWithSumK(arr, K);
            System.out.println(result);
        }

        sc.close();
    }

    // Function to count subarrays with sum K
    public static int countSubarraysWithSumK(int[] arr, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Sum 0 initially exists once

        int sum = 0, count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - K)) {
                count += map.get(sum - K);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
