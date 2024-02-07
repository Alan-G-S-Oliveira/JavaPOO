package br.edu.ufca.Conta;

public class RepositoriosContasVetor {
    
    Conta[] contas;
    int tamanho;

    public RepositoriosContasVetor(){

        tamanho = 20;
        contas = new Conta[20];

    }

    void adcionar(Conta conta){

        int i = 0;
        boolean adcionou = false;

        if(procurarIndice(conta.numero) == -1){

            while(i < contas.length && !adcionou){

                if(contas[i] == null){

                    contas[i] = conta;
                    adcionou = true;

                } else
                    i++;

            }

            if(!adcionou)
                System.out.println("ERRO: O repositório está cheio!");
                
        }else
            System.out.println("ERRO: Conta já existente!");  

    }

    Conta ler(String numero){

        int i = procurarIndice(numero);

        if(i != -1)
            return contas[i];
    
        System.out.println("ERRO: A conta a ser lida não existe! ");
         return null;


    }

    void atualizar(Conta conta){

        int i = procurarIndice(conta.numero);

        if(i != -1)
            contas[i] = conta;
        else
            System.out.println("ERRO: A conta a ser atualizada não existe!");

    }

    void remover(Conta conta){

        int i = procurarIndice(conta.numero);
        if(i != -1)
            contas[i] = null;
        else
            System.out.println("ERRO: A conta a ser removida não existe!");

    }

    int procurarIndice(String numero){

        for(int i = 0; i < contas.length; i++){

            if(contas[i] != null && contas[i].numero.equals(numero))
                return i;

        }

        return -1;
        
    }

}
