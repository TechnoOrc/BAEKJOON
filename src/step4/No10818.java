package step4;

import java.util.Scanner;

public class No10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] intVar = new int[N];
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < N; i++) {
            intVar[i] = sc.nextInt();
            if (max <= intVar[i]) {
                max = intVar[i];
            }
            if (min >= intVar[i]) {
                min = intVar[i];
            }
        }
        sc.close();
        System.out.print(min + " " + max);

    }// main
}// class