package Introducao.ModificadorEstatico.dominio;

public class Time {
    private String nome;
    private Jogador [] jogadores;
    public Time(String nome){
        this.nome = nome;
    }



    public Time(Jogador[] jogadores, String nome) {
        this.jogadores = jogadores;
        this.nome = nome;
    }

    public Jogador[] getJogadores(Jogador[] jogadores) {
        return this.jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(this.jogadores != null){
            for (int i = 0; i < this.jogadores.length; i++) {
                System.out.println(this.jogadores[i]);
            }
        }
    }

}
