package Introducao.Sobrecarga.test;

import Introducao.Sobrecarga.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("A");
        for (int i = 0; i < anime.getEpisodios().length; i++) {
            System.out.print(anime.getEpisodios()[i]+" ");
        }
    }

}
