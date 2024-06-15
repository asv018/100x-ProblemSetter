import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        int m = 1 << n;
        long[] arr = new long[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        Map<Long, Long> sums = new HashMap<>();
        sums.put(0L, 1L);

        List<Long> ans = new ArrayList<>();
        List<Long> subsums = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (sums.getOrDefault(arr[i], 0L) > 0) {
                sums.put(arr[i], sums.get(arr[i]) - 1);
            } else {
                ans.add(arr[i]);
                List<Long> temp = new ArrayList<>();
                for (Long z : subsums) {
                    temp.add(z + arr[i]);
                    sums.put(z + arr[i], sums.getOrDefault(z + arr[i], 0L) + 1);
                }
                for (Long z : temp) {
                    subsums.add(z);
                }
                subsums.add(arr[i]);
            }
        }

        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
