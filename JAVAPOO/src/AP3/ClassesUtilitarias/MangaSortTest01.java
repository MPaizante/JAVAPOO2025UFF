package AP3.ClassesUtilitarias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack On Titan",19.9));
        mangas.add(new Manga(1L,"Berserk",19.9));
        mangas.add(new Manga(2L,"Naruto",19.9));
        mangas.add(new Manga(3L,"DBZ",19.9));
        mangas.add(new Manga(4L,"Full Metal",19.9));
        mangas.add(new Manga(6L,"DANDANDAN",19.9));
        System.out.println(mangas);
        Collections.sort(mangas);
        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
