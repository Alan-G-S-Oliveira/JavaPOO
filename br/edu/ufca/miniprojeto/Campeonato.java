package br.edu.ufca.miniprojeto;

import java.util.ArrayList;
import java.util.Random;

public class Campeonato {

    /*
     * Os atributos do campeonato, todos são privados e só podem ser
     * modificados via construtor ou métodos internos. Além disso,
     * podem ter seus valores acessados por meio das funções get.
     */
    private Clube[] clubes;
    private ArrayList<String> resultados = new ArrayList<String>();

    /*
     * O primeiro contrutor recebe o vetor clubes como parâmetro,
     * cria o vetor this.clubes com o tamanho de clubes e copia
     * os elementos de clube para this.clubes.
     */
    Campeonato(Clube[] clubes){

        this.clubes = new Clube[clubes.length];

        for(int i = 0; i < clubes.length; i++)
            this.clubes[i] = clubes[i];

    }

    /*
     * O segundo contrutor age de forma semelhante ao primeiro,
     * só que, em vez de receber um vetor como parânetro,
     * ele recebe a ArrayList clubes.
     */
    Campeonato(ArrayList<Clube> clubes){

        this.clubes = new Clube[clubes.size()];

        for(int i = 0; i < clubes.size(); i++)
            this.clubes[i] = clubes.get(i);

    }

    void jogarCampeonato(){

        /*
         * Usa dois for para percorre this.clubes,
         * o i representa o clube mandante
         * e o j representa o clube visitante.
         */
        for(int i = 0; i < this.clubes.length; i++){

            for(int j = 0; j < this.clubes.length; j++){

                /*
                 * Somente chama a função jogarPartida(),
                 * pois quando i == j, o clube tem que enfrentar ele mesm0,
                 * o que não pode ocorrer.
                 */
                if(i != j)
                    this.jogarPartida(this.clubes[i], this.clubes[j]);

            }

        }

    }

    private void jogarPartida(Clube m, Clube n){

        //num para sortear os gols.
        Random num = new Random();

        //golsM e golsN guardam os gols de m e n, repectivamente.
        int golsM, golsN;

        //Guarda o valor absoluto da diferença gols dos clubes.
        int saldoGols;

        //Sorteia os gols para m e n.
        golsM = num.nextInt(6);
        golsN = num.nextInt(6);

        //É calculado a diferença de gols.
        saldoGols = Math.abs(golsM - golsN);

        //Se golsM > golsN, então m ganhou e n perdeu.
        if(golsM > golsN){

            //Chama os métodos m.ganhar e n.perder, respectivamente,
            //passando como argumento saldoGols.
            m.ganhar(saldoGols);
            n.perder(saldoGols);

        //Se golsM == golsN, então deu empate
        } else if(golsM == golsN){

            //Chama os métodos m.empate e n.empate, respectivamente.
            m.empatar();
            n.empatar();

        //Caso contrário, temos que m perdeu e n ganhou.
        } else{

            //Chama os métodos m.perder e n.ganhar, respectivamente.
            //passando como argumento saldoGols.
            m.perder(saldoGols);
            n.ganhar(saldoGols);

        }

        //Adciona em resultados o placar do jogo devidamente formatado.
        resultados.add(String.format("%13s%5d  -  %-5d%-13s\n", m.getNome(), golsM, golsN, n.getNome()));

    }

    public String getClassificacao(){

        //Chama o método auxiliar ordena times.
        this.ordena_times();

        //Cria uma string vazia.
        String classificacao = "";

        //O cabeçario da tabela de classificação
        classificacao += "-------------------------------------------------------------------------------------------------\n";
        classificacao += "|   Time             |   Pontos  |   Saldo de gols   |   Vitórias    |  Empates  |   Derrotas   |\n";
        classificacao += "-------------------------------------------------------------------------------------------------\n";
        
        /*
         * Navega por this.clubes, que já está ordenado em ordem não crescente
         * e adciona as informações do clube devidamente formatadas.
         */
        for(int i = 0; i < this.clubes.length; i++)
            classificacao += String.format("|   %-13s    |  %4d     |   %7d         | %7d       |  %4d     |   %5d      |\n",
            this.clubes[i].getNome(), this.clubes[i].getPontos(), this.clubes[i].getSaldoGols(),
            this.clubes[i].getVitorias(), this.clubes[i].getEmpates(), this.clubes[i].getDerrotas());

        classificacao += "-------------------------------------------------------------------------------------------------\n";

        //Retorna a tabela de classificação.
        return classificacao;

    }

    /*
     * Ordena os times em ordem não decrescente usando o algoritmo de
     * BubbleSort, com a única diferença que quando os pontos de
     * clubes[i] forem igual aos de clubes[j] ele verifica os saldo
     * de gols para fazer ou não a troca.
     */
    private void ordena_times(){

        for(int i = 0; i < this.clubes.length - 1; i++){

            for(int j = i + 1; j < this.clubes.length; j++){

                if(this.clubes[i].getPontos() < this.clubes[j].getPontos()){

                    Clube auxiliar = this.clubes[i];
                    this.clubes[i] = this.clubes[j];
                    this.clubes[j] = auxiliar;

                } else if(this.clubes[i].getPontos() == this.clubes[j].getPontos()){

                    if(this.clubes[i].getSaldoGols() < this.clubes[j].getSaldoGols()){

                        Clube auxiliar = this.clubes[i];
                        this.clubes[i] = this.clubes[j];
                        this.clubes[j] = auxiliar;

                    }

                }

            }

        }

    }

    //Retorna o campeão que, como o algoritmo está ordenado
    //em ordem não crescente, é this.clubes[0]
    public Clube getCampeao(){

        return this.clubes[0];

    }

    //Retorna a ArrayList resultados.
    public ArrayList<String> getResultados() {

        return resultados;

    }
    
}
