package br.edu.ufca.Conta;

public class Conta {

    String numero;
    Cliente cliente;
    private double saldo;

    Conta(String numero, Cliente cliente){

        this.numero = numero;
        this.cliente = cliente;
        saldo = 0;

    }

    Conta(String numero){

        this.numero = numero;

    }

    Conta(){

    }

    void creditar(double valor){

        saldo += valor;

    }

    boolean debitar(double valor){

        if(valor <= saldo){

            saldo -= valor;
            return true;

        }

        System.out.println("Saldo insuficiente");
        return false;

    }

    double consultarSaldo(){

        return saldo;

    }

    void transferir(Conta c, double valor){

        if(this.debitar(valor)){

            c.creditar(valor);
            System.out.println("Transferência concluída com sucesso!");

        }

    }

    public String toString() {
       
        return "Número: " + numero + ";\nSaldo: " + saldo + ".\n";

    }

    public boolean equals(Object obj) {

        Conta n = (Conta)obj;

        if(numero.equals(n.numero))
            return true;

        return false;

    }
    
}
