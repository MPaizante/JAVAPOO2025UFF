package AP3.ClassesUtilitarias;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private Double preco;

    public Manga(Long id,String nome, Double preco){
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        Objects.requireNonNull(preco);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public Long getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;

    }
    public Double getPreco(){
        return this.preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString(){
        String texto = "ID: "+this.id+", Nome: "+this.nome+", Preço:"+this.preco;
        return texto;
    }
    @Override
    public int compareTo(Manga o){
        if(this.id < o.getId()){
            return -1;
        }else if(this.id.equals(o.getId())){
            return 0;
        }else {
            return 1;
        }

    }
}
