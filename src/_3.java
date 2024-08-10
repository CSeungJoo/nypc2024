import java.util.Scanner;

public class _3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(solution(A, B));
        }
    }
    public static int solution(int a, int b) {
        int calc = Math.max(a, b) / Math.min(a, b);
        int remain = Math.max(a, b) % Math.min(a, b) >= 1 ? 1 : 0;
        if (3 < calc + remain || a == 0 || b == 0)
            return -1;
        else
            return (a + b + 3) / 4;
    }
}
// 1 1
// 1 2
// 1 3
// 1 4 x
// 2 1
// 2 2
// 2 3
// 2 4
// 2 5
// 2 6
// 2 7 x
// 3 1
// 3 2
// 3 3
// 4 1 x
// 4 2
// 4 3
// 4 4
// 5 1 x
// 5 2
// 5 3
// 5 4
// 5 5
// 6 1 x
// 6 2
// 7 2 x
// 7 3
// 7 4
// 7 5
// 7 6
// 7 7