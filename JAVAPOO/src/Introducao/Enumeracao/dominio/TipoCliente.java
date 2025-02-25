package Introducao.Enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"PESSOA_FISICA"), PESSOA_JURIDICA(2,"PESSOA_JURIDICA");
    private final int VALOR;
    private String relatorio;

    public static TipoCliente tipoClienteNomeRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){
            if(tipoCliente.getRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }


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

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
}
