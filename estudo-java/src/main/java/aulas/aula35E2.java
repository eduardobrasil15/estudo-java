package aulas;

import java.util.Scanner;

public class aula35E2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas Horas?");
        hora = sc.nextInt();

        if (hora < 12 ) {
            System.out.println("Bom Dia");
        }
        else {
            System.out.println("Boa Tarde");
        }
        sc.close();
    }
}
