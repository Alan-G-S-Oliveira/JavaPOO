package br.edu.ufca.Retangulo;

import java.util.Scanner;
import br.edu.ufca.Ponto.*;

public class App {
    
    public static void main(String[] args) {
        
        try (Scanner ler = new Scanner(System.in)) {
            Ponto2D p1, p2, p3;
            Retangulo r1, r2, r3;

            double x1, y1, x2, y2;

            System.out.println("Digite as coordenadas x1 e y1: ");
            x1 = ler.nextDouble();
            y1 = ler.nextDouble();

            System.out.println("Digite as coordenadas x2 e y2: ");
            x2 = ler.nextDouble();
            y2 = ler.nextDouble();

            p1 = new Ponto2D();
            p2 = new Ponto2D(5);
            p3 = new Ponto2D(3);

            r1 = new Retangulo(p1, p2);
            r2 = new Retangulo(x1, y1, x2, y2);

            if(r1.dentroRetangulo(p3))
                System.out.println("O ponto p3 está dento de r1.");
            else
                System.out.println("O ponto p3 não está dentro de r1.");

            r3 = r1.calculaIntersecção(r2);

            System.out.println(r3.p1.x);
            System.out.println(r3.p1.y);
            System.out.println(r3.p2.x);
            System.out.println(r3.p2.y);

        }

    }

}
