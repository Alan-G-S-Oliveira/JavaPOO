package br.edu.ufca.miniprojeto;

import java.io.IOException;

public class Teste {

    //Método auxiliar que limpa o terminal.
    private static void limparTerminal() throws InterruptedException, IOException{

        //Verifica o sistema operaccional.
        String os = System.getProperty("os.name").toLowerCase();

        //Se for Windows.
        if (os.contains("win"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        //Se for algum sistema tipo unix.
        else
            new ProcessBuilder("clear").inheritIO().start().waitFor();

    }

    public static void main(String[] args) throws InterruptedException, IOException {
        
        Clube[] times = new Clube[20];
        Campeonato campeonato;
        String tabela;

        //Variáveis auxiliares
        char menu1, menu2, lixo;

        limparTerminal();

        //Permanece no laço enquanto os valores 1 ou 2 não forem digitados.
        do{

            System.out.println("--------------------------------------------------------------------");
            System.out.println("                    CAMPEONATO BRASILEIRO DE 2024                   ");
            System.out.println("--------------------------------------------------------------------");

            System.out.println("\nAperte:\n1 - Para iniciar a competição.\n2 - Para sair.");

            menu1 = (char) System.in.read();
            do{

                lixo = (char) System.in.read();

            } while(lixo != '\n');

            limparTerminal();

        } while(menu1 != '1' && menu1 != '2'); 

        //Se menu1 = '2' então o campeonato é iniciado.
        if(menu1 == '1'){
            
            //Times participantes.
            times[0] = new Clube("Athletico");
            times[1] = new Clube("Atlético-GO");
            times[2] = new Clube("Atlético-MG");
            times[3] = new Clube("Bahia");
            times[4] = new Clube("Botafogo");
            times[5] = new Clube("Bragantino");
            times[6] = new Clube("Corinthians");
            times[7] = new Clube("Criciúma");
            times[8] = new Clube("Cruzeiro");
            times[9] = new Clube("Cuiabá");
            times[10] = new Clube("Flamengo");
            times[11] = new Clube("Fluminense");
            times[12] = new Clube("Fortaleza");
            times[13] = new Clube("Grêmio");
            times[14] = new Clube("Internacional");
            times[15] = new Clube("Juventude");
            times[16] = new Clube("Palmeiras");
            times[17] = new Clube("São Paulo");
            times[18] = new Clube("Vasco");
            times[19] = new Clube("Vitória");
        
            //Cria o campeonato.
            campeonato = new Campeonato(times);
        
            campeonato.jogarCampeonato();
            tabela = campeonato.getClassificacao();

            //Permanece no laço enquanto os valores 1 ou 2 não forem digitados.
            do{

                //Exibe a tabela de classificação final.
                System.out.println("Classificação final:\n\n");
                System.out.println(tabela);

                //Exibe uma mensagem de parabéns ao campeão.
                System.out.println("\n\nO Grande campeão foi " + campeonato.getCampeao().getNome() + ". Parabéns!!");

                System.out.println("\n\nAperte:\n1 - Para ver todos os resultados.\n2 - Para sair.");

                menu2 = (char) System.in.read();
                do{

                    lixo = (char) System.in.read();

                } while(lixo != '\n');

                limparTerminal();

            } while(menu2 != '1' && menu2 != '2');

            //Se menu2 == '1' percorre a ArrayList resultados e imprime os resultados.
            if(menu2 == '1'){

                System.out.println("Esses foram os resultados das partidas:\n\n");
                for(int i = 0; i < campeonato.getResultados().size(); i++)
                    System.out.println(campeonato.getResultados().get(i));

                System.out.println("\n\nAperte Enter para sair.");
                lixo = (char) System.in.read();

            }
            
        }

    }

}
