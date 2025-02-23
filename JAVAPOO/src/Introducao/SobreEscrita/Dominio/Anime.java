package Introducao.SobreEscrita.Dominio;

public class Anime {
    private String nome;

    @Override
    public String toString(){
        return "Anime: " + this.nome;
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
