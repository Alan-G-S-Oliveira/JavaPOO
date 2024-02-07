package br.edu.ufca.HeartRates;

import br.edu.ufca.Data.*;

public class HeartRates {

    String nome;
    String sobreNome;
    Data nascimento;

    HeartRates(String n, String sN, Data x){

        nome = n;
        sobreNome = sN;
        nascimento = x;

    }

    int idade(int frequencia){

        return 220 - frequencia;

    }

    int frequenciaMaxima(int idade){

        return 220 - idade;

    }

    long frequenciaAlvo(int frequencia){

        return Math.round(frequencia * 0.7);

    }
    
}
