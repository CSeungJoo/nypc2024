import java.util.Scanner;

public class Main {
    static Integer[] lis;
    static Integer[] lds;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new int[N];
        lis = new Integer[N];
        lds = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            lis(i);
            lds(i);
        }

        int maxLength = 1;
        for (int i = 1; i < N; i++) {
            maxLength = Math.max(lds[i] + lis[i] - 2, maxLength);
        }
        System.out.println(maxLength);
    }

    static int lis(int n) {
        if (lis[n] == null) {
            lis[n] = 1;

            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] < arr[n]) {
                    lis[n] = Math.max(lis[n], lis[i] + 1);
                }
            }
        }
        return lis[n];
    }

    static int lds(int n) {
        if (lds[n] == null) {
            lds[n] = 1;

            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > arr[n]) {
                    lds[n] = Math.max(lds[n], lds[i] + 1);
                }
            }
        }
        return lds[n];
    }


}
