package Introducao.ModificadorEstatico.dominio;

public class Carro {
    private String nome;
    private double velMax;
    private static  double velLimite = 250;

    public void imprime(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("O carro "+this.nome + " de velocidade maxima "+Carro.velLimite + " só pode ir até " + this.velMax+"KM/h.");
        System.out.println("----------------------------------------------------------------------");
    }
    public Carro(String nome, double velMax ){
        this.nome = nome;
        this.velMax = velMax;

    }
    public Carro(){

    }






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setVelLimite(double velLimite) {
        Carro.velLimite = velLimite;
    }
    public double getVelLimite() {
        return velLimite;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }




}
