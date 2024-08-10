import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] client = new int[N];
        for (int i = 0; i < N; i++) {
            client[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(solution(client));
    }

    public static int solution(int[] client) {
        int N = client.length;

        switch (N) {
            case 1: return client[0];
            case 2: return Math.max(client[1], client[0]);
        }

        int[] dp = new int[N];

        dp[0] = client[0];
        dp[1] = Math.max(client[1], client[0]);

        for (int i = 2; i < N; i++) {
            dp[i] = Math.min(dp[i - 1] + client[i], dp[i - 2] + Math.max(client[i], client[i - 1]) );
        }
        return dp[N - 1];
    }
}
