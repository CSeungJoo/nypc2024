import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] client = new int[N];
        for (int i = 0; i < N; i++) {
            client[i] = sc.nextInt();
        }
        sc.close();


        System.out.println(solution(0, 0, N, client));
    }
    public static int solution(int index, int num, int maxIndex, int[] client) {
        if (index == maxIndex - 1)
            return num;

        int one = solution(index + 1, num + client[index + 1], maxIndex, client);
        int two = Integer.MAX_VALUE;
        if (index != maxIndex - 2)
            two= solution(index + 2, num + (client[index + 1] > client[index + 2] ? client[index + 1] : client[index + 2]), maxIndex, client);

        return one < two ? one : two;
    }
}
