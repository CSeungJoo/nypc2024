import java.util.HashMap;
import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;
        int[][] coordinate = new int[N][2];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            coordinate[i][0] = x;
            coordinate[i][1] = y;
        }

        HashMap<Integer, Boolean> xIgnore = new HashMap<>();
        HashMap<Integer, Boolean> yIgnore = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int x = coordinate[i][0];
            int y = coordinate[i][1];

            if (!xIgnore.containsKey(x)) {
                xIgnore.put(x, false);
            } else if (!xIgnore.get(x)) {
                xIgnore.put(x, true);
                cnt++;
            }

            if (!yIgnore.containsKey(y)) {
                yIgnore.put(y, false);
            } else if (!yIgnore.get(y)) {
                yIgnore.put(y, true);
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
