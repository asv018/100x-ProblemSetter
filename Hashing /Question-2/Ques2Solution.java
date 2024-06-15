import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                int x = sc.nextInt();
                m.put(x, m.getOrDefault(x, 0) + 1);
            }
            int ans = 0;
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (value >= key) {
                    ans += value - key;
                } else {
                    ans += value;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}