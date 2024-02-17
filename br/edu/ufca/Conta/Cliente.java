package br.edu.ufca.Conta;

public class Cliente {

    private String nome;
    private String sobreNome;
    private String cpf;

    public Cliente(String nome, String sobreNome, String cpf){

        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;

    }

    public String getNome(){

        return this.nome;

    }

    public String getSobreNome(){

        return this.sobreNome;

    }

    public String getCPF(){

        return this.cpf;
        
    }
    
}
