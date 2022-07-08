/*
*   Contibuidor: Eduardo Programador
*   www.eduardoprogramador.com
*   Instagram: eduardo_programador
* */

package com.company;

import java.util.Scanner;

public class Main {

    private static double FiO2;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a PaO2: ");
        double PaO2 = scan.nextDouble();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a FiO2");
        FiO2 = scanner.nextDouble();

        while(FiO2 == 0) {
            reDo();
        }

        double relacao = PaO2 / FiO2;
        System.out.println("Relação PaO2/FiO2 é:" + relacao);

        System.out.println("Até logo!");

    }

    public static void reDo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fi02 não pode ser zero!");
        System.out.println("Digite a FiO2: ");
        FiO2 = scan.nextDouble();
    }

}
