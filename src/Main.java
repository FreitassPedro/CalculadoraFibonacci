    /* A sequência de Fibonacci é uma sequência de números,
     onde o número 1 é o primeiro e segundo termo da ordem
     e os demais são originados pela soma de seus antecessores
     */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Desejo saber o Fibonacci de: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i));
            System.out.print(" ");
        }
    }
    public static int fibonacci(Integer n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}