package br.edu.ufca.Conta;

public class Conta {

    private String numero;
    private Cliente cliente;
    private double saldo;

    public Conta(String numero, Cliente cliente){

        this.numero = numero;
        this.cliente = cliente;
        saldo = 0;

    }

    public Conta(String numero){

        this.numero = numero;

    }

    public Conta(){

    }

    public void creditar(double valor){

        saldo += valor;

    }

    public boolean debitar(double valor){

        if(valor <= saldo){

            saldo -= valor;
            return true;

        }

        System.out.println("Saldo insuficiente");
        return false;

    }

    public double consultarSaldo(){

        return saldo;

    }

    public void transferir(Conta c, double valor){

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

    public String getNumero(){

        return this.numero;

    }

    public Cliente getCliente(){

        return this.cliente;

    }

    public double getSaldo(){

        return this.saldo;

    }
    
}
