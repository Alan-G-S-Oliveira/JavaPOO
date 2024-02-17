package br.edu.ufca.miniprojeto;

public class Clube {

    /*
     * Atributos oclube, todos são privados e só podem ser 
     * modificados via contrutor ou métodos internos. Além disso,
     * podem ter seus valores acessados por meios das funções get.
     */
    private String nome;
    private int pontos, saldoGols;
    private int vitorias, empates, derrotas;

    public Clube(String nome){

        //Todo clube começa com os atributos numéricos igual a zero.
        this.nome = nome;
        this.pontos = this.saldoGols = 0;
        this.vitorias = this.empates = this.derrotas = 0;

    }

    public void ganhar(int saldoGols){

        /*
         * O time vencedor ganha 3 pontos,
         * seu saldo de gols é incrementado,
         * o número de vitórias é incrementado em 1.
         */
        this.pontos += 3;
        this.saldoGols += saldoGols;
        this.vitorias++;

    }

    public void empatar(){

        /*
         * O time ganha 1 ponto,
         * seu saldo de gols permanece inalterado,
         * o número de empates é incrementado em 1.
         */
        this.pontos++;
        this.empates++;

    }

    public void perder(int saldoGols){

        /*
         * O saldo de gols é decrementado,
         * o número de derrotas é incrementado em 1.
         */
        this.saldoGols -= saldoGols;
        this.derrotas++;
        
    }

    //Retorna o nome do clube.
    public String getNome(){

        return this.nome;

    }

    //Retorna a quantidade de pontos.
    public int getPontos(){

        return this.pontos;

    }

    //Retorna o saldo de gols.
    public int getSaldoGols(){

        return this.saldoGols;
        
    }

    //Retorna o número de vitórias.
    public int getVitorias(){

        return this.vitorias;

    }

    //Retorna o número de empates.
    public int getEmpates(){

        return this.empates;

    }

    //Retorna o número de derrotas.
    public int getDerrotas(){

        return this.derrotas;

    }
    
}
