package aulas;

import java.util.Scanner;

public class aula40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.01;
        }
        else {
            desconto = preco * 0.05;

        }

        System.out.println(desconto);

        sc.close();

    }
}
