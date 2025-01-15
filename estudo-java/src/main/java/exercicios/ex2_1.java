package exercicios;

import java.util.Scanner;

public class ex2_1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 0) {
                System.out.println("Negativo");
        }
        else {
                System.out.println("Não Negativo");
        }
        sc.close();
    }
}
