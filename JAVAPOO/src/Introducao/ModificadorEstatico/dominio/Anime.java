package Introducao.ModificadorEstatico.dominio;

public class Anime {
    private String nome;
    private static int [] episodios;
    static {
        System.out.println("Dentro bloco de inicialização!");
        Anime.episodios =new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] += i +1;
            System.out.print(Anime.episodios[i]+" ");
        }
        System.out.println("");
    }

    public Anime(){
       Anime.episodios =new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] += i +1;
            System.out.print(Anime.episodios[i]+" ");
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
