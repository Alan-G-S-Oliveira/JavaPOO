package br.edu.ufca.Musica;

public class Musica {
    
    String nome;
    String autor;
    String genero;
    String album;
    String letra;

    void tocarMusica(){

        System.out.println("Iniciando música");
        System.out.println(letra);
        System.out.println("Finalizando música ");

    }

    void imprimirDados(){

        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " +  genero);
        System.out.println("Álbum: " + album);

    }

}
