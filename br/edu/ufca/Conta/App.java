package br.edu.ufca.Conta;

public class App {

    public static void main(String [] args){

        RepositoriosContasVetor rep = new RepositoriosContasVetor();
        Conta c1, c2, c3, c4, c5;

        c1 = new Conta("1");
        c2 = new Conta("2");
        c3 = new Conta("3");
        c4 = new Conta("4");
        c5 = new Conta("5");

        rep.adcionar(c1);
        rep.adcionar(c2);
        rep.adcionar(c3);
        rep.adcionar(c4);
        rep.adcionar(c1);

        c5.creditar(27.65);

        rep.atualizar(c5);

        c5.transferir(c1, 20);

        rep.atualizar(c1);
   
        System.out.println(c1.consultarSaldo());
        System.out.println(c5.consultarSaldo());

    }
    
}