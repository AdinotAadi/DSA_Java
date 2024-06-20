package Algorithms.Recursion.TowerOfHanoi;

import java.util.*;

public class towerOfHanoi {
    public static long solve(int n, int from, int to, int aux, long count) {
        if(n == 0) { return count; }
        count = solve(n - 1, from, aux, to, count);
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        return solve(n - 1, aux, to, from, count + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, from, to, aux;
        n = sc.nextInt();
        from = sc.nextInt();
        to = sc.nextInt();
        aux = sc.nextInt();
        System.out.println(solve(n, from, to, aux, 0));
        sc.close();
    }
}
