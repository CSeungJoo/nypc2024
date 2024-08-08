import java.util.*;

public class _3 {
    public static int result = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(solution(A, B, 1));
            result = Integer.MAX_VALUE;
        }
    }
    public static int solution(int a, int b, int cnt) {
        int[][] dxdy = {{1, 1}, {2, 0}, {0, 2}, {1, 0}, {0, 1}};

        if (--a < 0 || --b < 0)
            return -1;

        if (a + b <= 2) {
            if (cnt < result)
                result = cnt;
            return cnt;
        }else {
            for (int i = 0; i < dxdy.length; i++) {
                int value = solution(a - dxdy[i][0], b - dxdy[i][1], cnt + 1);

                if (value != -1)
                    solution(a - dxdy[i][0], b - dxdy[i][1], cnt + 1);
            }
        }
        if (result == Integer.MAX_VALUE)
            return -1;
        return result;
    }
}