package br.edu.ufca.Ponto;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        try (Scanner ler = new Scanner(System.in)) {
            Ponto2D p1, p2, p3, p4;

            double x, y, n;

            System.out.println("Digite a coordenada x: ");
            x = ler.nextDouble();

            System.out.println("Digite a coordenada y: ");
            y = ler.nextDouble();

            System.out.println("Digite um número: ");
            n = ler.nextDouble();

            p1 = new Ponto2D();
            p2 = new Ponto2D(x, y);
            p3 = new Ponto2D(n);
            p4 = new Ponto2D(p2);

            System.out.println("\nPonto p1: ");
            p1.exibePonto();
            System.out.println("\nPonto p2: ");
            p2.exibePonto();
            System.out.println("\nPonto p3: ");
            p3.exibePonto();
            System.out.println("\nPonto p4: ");
            p4.exibePonto();
            System.out.println();
        }
        
    }

}
