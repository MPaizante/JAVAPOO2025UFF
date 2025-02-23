package Introducao.SobreEscrita.test;

import Introducao.SobreEscrita.Dominio.Anime;

public class TestAnime01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr Stone");
        System.out.println(anime.getNome());
    }
}
