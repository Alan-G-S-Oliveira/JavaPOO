package br.edu.ufca.Calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {

    double x;
    double y;
    char op;
    boolean sucesso;

    double calcular(){

        sucesso = true;

        if(op == '+')
            return x + y;
        if(op == '-')
            return x - y;
        if(op == '*')
            return x * y;
        if(op == '/'){

            if(y == 0){

                System.out.println("Não é possível dividir por zero.\n\n");
                sucesso = false;
                return 0;

            }

            return x / y;

        }

        System.out.println("Operação inválida!\n\n");
        sucesso = false;
        return 0;

    }

    void imprimirMenu() throws IOException{

        try (Scanner ler = new Scanner(System.in)) {
            double resultado;
            int menu;

            do{
                do{

                    System.out.println("Aperte:\n1 - Realizar operação;\n2 - Sair.");
                    menu = ler.nextInt();
                
                } while(menu != 1 && menu != 2);

                if(menu == 2)
                    return;

                System.out.println("Digite o primeiro valor: ");
                x = ler.nextDouble();

                System.out.println("Digite o segundo valor: ");
                y = ler.nextDouble();

                System.out.println("Digite a operação a ser realizada: ");
                op = (char) System.in.read();

                resultado = calcular();

                if(sucesso)
                    System.out.println("O resultado de " + x + ' ' + op + ' ' + y + " é igual a " + resultado + "\n\n");

            } while(true);
        }

    }

}
