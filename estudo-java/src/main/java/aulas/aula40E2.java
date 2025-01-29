package aulas;

import java.util.Scanner;

public class aula40E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;

        System.out.println(desconto);

        sc.close();
    }
}
