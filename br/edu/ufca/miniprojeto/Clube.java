package br.edu.ufca.miniprojeto;

public class Clube {

    private String nome;
    private int pontos, saldoGols;

    public Clube(String nome){

        this.nome = nome;
        this.pontos = saldoGols = 0;

    }

    public void ganhar(int saldoGols){

        this.pontos += 3;
        this.saldoGols += saldoGols;

    }

    public void empatar(){

        this.pontos++;

    }

    public void perder(int saldoGols){

        this.saldoGols -= saldoGols;
        
    }

    public String nome(){

        return this.nome;

    }

    public int pontos(){

        return this.pontos;

    }

    public int saldoGols(){

        return this.saldoGols;
        
    }
    
}
