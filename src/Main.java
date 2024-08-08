import java.util.*;
public class Main {
    Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean donWork = false;
        boolean anWork = false;

        int[] client = new int[N];
        for (int i = 0; i < N; i++) {
            client[i] = sc.nextInt();
        }
        sc.close();


        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while(!stack.empty()) {
            int pop = stack.pop();

            stack.push(pop + client[1]);
            stack.push(pop + client[2]);
        }
    }
}
