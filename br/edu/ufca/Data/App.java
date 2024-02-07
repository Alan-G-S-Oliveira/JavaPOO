package br.edu.ufca.Data;

public class App {

    public static void main(String[] args) {
        
        Data data1 = new Data(21, 07, 2003);
        Data data2 = new Data(22, 07, 2003);

        System.out.print("Data 1: ");
        data1.exibirData();

        System.out.print("Data 2: ");
        data2.exibirData();

        System.out.println(data1.vemAntes(data2));

    }
    
}
