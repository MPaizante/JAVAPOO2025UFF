package Introducao.Enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"PESSOA_FISICA"), PESSOA_JURIDICA(2,"PESSOA_JURIDICA");
    private final int VALOR;
    private String relatorio;
    TipoCliente(int valor, String relatorio){
        this.VALOR = valor;
        this.relatorio = relatorio;
    }
    public String getRelatorio(){
        return this.relatorio;
    }
    public int getVALOR(){
        return this.VALOR;
    }

}
