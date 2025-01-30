package Introducao.Sobrecarga.dominio;

public class Anime {
    private String nome;
    private int [] episodios;
    {
        this.episodios =new int[100];
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] += i +1;
            System.out.print(this.episodios[i]+" ");
        }
        System.out.println("");
    }

    public Anime(){
        this.episodios =new int[100];
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] += i +1;
            System.out.print(this.episodios[i]+" ");
        }
        System.out.println("");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
