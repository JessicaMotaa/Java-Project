package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a PaO2: ");
        double PaO2 = scan.nextDouble();

        System.out.println("Digite a FiO2: ");
        double FiO2 = scan.nextDouble();

        double relacao = PaO2 / FiO2;
        System.out.println("Relação PaO2/FiO2 é:" + relacao);
    }
}
