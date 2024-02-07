package br.edu.ufca.Ponto;

public class Ponto2D {

    public double x;
    public double y;

    public Ponto2D(){

        x = y = 0;

    }

    public Ponto2D(double x, double y){

        this.x = x;
        this.y = y;

    }

    public Ponto2D(double n){

        x = y = n;

    }

    public Ponto2D(Ponto2D p){

        x = -p.x;
        y = -p.y;

    }

    public void exibePonto(){

        System.out.println("Ponto x: " + x + ".");
        System.out.println("Ponto y: " + y + ".");

    }

    public double distanciaPontos(Ponto2D p){

        return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));

    }
    
}
