package br.edu.ufca.Data;

public class Data {
    
    int dia;
    int mes;
    int ano;

    public Data(int d, int m, int a){

        dia = d;
        mes = m;
        ano = a;

    }

    void exibirData(){

        System.out.println(dia + "/" + mes + "/" + ano);

    }

    boolean vemAntes(Data d){

        if(ano < d.ano)
            return true;
        else if(ano > d.ano)
            return false;
        else{

            if(mes < d.mes)
                return true;
            else if(mes > d.mes)
                return false;
            else{

                if(dia < d.dia)
                    return true;
                else
                    return false;

            }

        }

    }

    @Override
    public boolean equals(Object obj) {
        Data d = (Data) obj;

        if(d.ano == this.ano && d.mes == this.mes && d.dia == this.dia)
            return true;
        
            return false;

    }

}
