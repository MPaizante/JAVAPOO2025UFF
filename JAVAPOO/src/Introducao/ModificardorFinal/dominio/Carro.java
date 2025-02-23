package Introducao.ModificardorFinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;

    public Carro(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

}
