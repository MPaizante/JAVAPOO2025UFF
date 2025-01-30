package Introducao.Sobrecarga.dominio;

public class Filme02 {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Filme02(String nome, String tipo, int  episodio,String genero){
        this();
        this.nome =nome;
        this.tipo = tipo;
        this.episodios = episodio;
        this.genero = genero;
    }
    public Filme02(String nome, String tipo, int  episodio,String genero , String estudio){
        this(nome, tipo,  episodio,genero);
        this.estudio = estudio;
    }

    public Filme02() {

    }

   /* public void init (String nome, String tipo, int  episodio){
        this.nome =nome;
        this.tipo = tipo;
        this.episodios = episodio;
    }
    public void init (String nome, String tipo, int  episodio, String genero){
        this.init(nome,tipo,episodio);
        this.genero = genero;
    }
*/


    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return this.episodios;
    }

    public void setNome(String nome){
        this.nome = nome;

    }
    public String getNome(){
        return this.nome;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println("O filme "+this.nome+" tem o genero de "+this.genero+" e conta com "+this.episodios+" filmes cronologicos que sai sempre no "+this.tipo+" feito pelo estudio "+ this.estudio+".");
    }

}
