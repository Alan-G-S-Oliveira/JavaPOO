package br.edu.ufca.HeartRates;

import java.util.Scanner;
   
import br.edu.ufca.Data.*;

public class App {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        HeartRates eu;
        Data nascimento;
        String nome;
        String sobreNome;

        int d, m, a, x;

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobreNome = ler.nextLine();

        System.out.println("Digite sua data de nascimento...");
        d = ler.nextInt();
        m = ler.nextInt();
        a = ler.nextInt();
        nascimento =  new Data(d, m, a);

        eu = new HeartRates(nome, sobreNome, nascimento);

        System.out.println("Digite sua idade: ");
        x = ler.nextInt();

        System.out.println("Sua frequência máxima é: " + eu.frequenciaMaxima(x));
        System.out.println("Sua frequência alvo é: " + eu.frequenciaAlvo(eu.frequenciaMaxima(x)));

        System.out.println("Digite sua frequência máxima: ");
        x = ler.nextInt();

        System.out.println("Sua idade é aproximadamente " + eu.idade(x) + " anos.");

        ler.close();

    }
    
}
