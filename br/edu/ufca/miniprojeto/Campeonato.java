package br.edu.ufca.miniprojeto;

import java.util.Random;

public class Campeonato {

    private Clube[] clubes;

    Campeonato(Clube ... clubes){

        this.clubes = new Clube[clubes.length];

        for(int i = 0; i < clubes.length; i++)
            this.clubes[i] = clubes[i];

    }

    void jogarCampeonato(){

        for(int i = 0; i < clubes.length; i++){

            for(int j = 0; j < clubes.length; j++){

                if(i != j)
                    this.jogarPartida(clubes[i], clubes[j]);

            }

        }

    }

    void jogarPartida(Clube m, Clube n){

        Random num = new Random();
        int golsM, golsN;

        golsM = num.nextInt() % 6;
        golsN = num.nextInt() % 6;

        if(golsM - golsN > 0){

            m.ganhar(golsM - golsN);
            n.perder(golsM - golsN);

        } else if(golsM - golsN == 0){

            m.empatar();
            n.empatar();

        } else{

            m.perder(golsN - golsM);
            n.perder(golsM - golsM);

        }

    }

    void ordena_times(){

        

    } 
    
}
