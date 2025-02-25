package Introducao.Enumeracao.dominio;

public class Cliente {
    private String nome;

    private TipoCliente tipoCliente;

    private TipoPagamento tipoPagamento;

   public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
    this.nome = nome;
    this.tipoCliente = tipoCliente;
    this.tipoPagamento = tipoPagamento;
   }


   public void setNome(String nome){
       this.nome = nome;
   }
   public String getNome(){
       return this.nome;
   }
   public void setTipoCliente(TipoCliente tipoCliente){
       this.tipoCliente = tipoCliente;
   }
   public TipoCliente getTipoCliente(){
       return this.tipoCliente;
   }
    public void setTipoPagamento(TipoPagamento tipoPagamento){
       this.tipoPagamento = tipoPagamento;
    }
    public TipoPagamento getTipoPagamento(){
       return this.tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getVALOR() +", tipoRelatorio=" + tipoCliente.getRelatorio() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
    /*  public Cliente(String nome, String tipo){
        if(tipo.equals(PESSOA_FISICA) == false && tipo.equals(PESSOA_JURIDICA) ==false){
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){

    }*/
}
