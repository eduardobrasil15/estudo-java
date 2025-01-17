package exercicios;

import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
                System.out.println("Sao Multiplus");
        }
        else {
            System.out.println("Nao Sao Multiplos");
        }
        sc.close();

    }
}
