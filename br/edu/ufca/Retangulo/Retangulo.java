package br.edu.ufca.Retangulo;

import br.edu.ufca.Ponto.*;

public class Retangulo {
    
    Ponto2D p1, p2;

    Retangulo(Ponto2D p1, Ponto2D p2){

        this.p1 = new Ponto2D(p1.x, p1.y);
        this.p2 = new Ponto2D(p2.x, p2.y);

    }

    Retangulo(double x1, double y1, double x2, double y2){

        this.p1 = new Ponto2D(x1, y1);
        this.p2 = new Ponto2D(x2, y2);

    }

    boolean dentroRetangulo(Ponto2D p){

        if(p1.x < p.x && p.x < p2.x){

            if(p1.y < p.y && p.y < p2.y)
                return true;
            else if(p2.y < p.y && p.y < p1.y)
                return true;
            else
                return false;

        }else if(p2.x < p.x && p.x < p1.x){

            if(p1.y < p.y && p.y < p2.y)
                return true;
            else if(p2.y < p.y && p.y < p1.y)
                return true;
            else
                return false;

        } else
            return false;

    }

    boolean dentroRetangulo(double x, double y){

        if(p1.x < x && x < p2.x){

            if(p1.y < y && y < p2.y)
                return true;
            else if(p2.y < y && y < p1.y)
                return true;
            else
                return false;

        }else if(p2.x < x && x < p1.x){

            if(p1.y < y && y < p2.y)
                return true;
            else if(p2.y < y && y < p1.y)
                return true;
            else
                return false;

        } else
            return false;

    }

    Retangulo calculaIntersecção(Retangulo r){

        Retangulo aux = null;

        System.out.println(r.p1.x + " " + p1.x);
        System.out.println(r.p1.y + " " + p1.y);
        System.out.println(r.p2.x + " " + p2.x);
        System.out.println(r.p2.y + " " + p2.y);

        if(!(dentroRetangulo(r.p1) || dentroRetangulo(r.p2))){

            if(!(r.dentroRetangulo(p1) || r.dentroRetangulo(p2)))
                return aux;

        }
        
        if(dentroRetangulo(r.p1) && dentroRetangulo(r.p2))
            aux = new Retangulo(r.p1, r.p2);
        else if(r.dentroRetangulo(p1) && r.dentroRetangulo(p2))
            aux = new Retangulo(p1, p2);
        else if(dentroRetangulo(r.p1)){

            if(r.dentroRetangulo(p1))
                aux = new Retangulo(r.p1, p1);
            else if(r.dentroRetangulo(p2))
                aux = new Retangulo(r.p1, p2);


        } else if(dentroRetangulo(r.p2)){

            if(r.dentroRetangulo(p1))
                aux = new Retangulo(r.p2, p1);
            else if(r.dentroRetangulo(p2))
                aux = new Retangulo(r.p2, p2);

        }

        return aux;

    }

}
