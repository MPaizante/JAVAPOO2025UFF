package Introducao.Enumeracao.dominio;

public enum TipoPagamento {
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor - (valor * 0.1);
        }
    }, DEBITO{
        @Override
        public double calcularDesconto(double valor){
            return valor - (valor*0.05);
        }
    };
    public double calcularDesconto(Double valor){
        return 0;
    }


    public abstract double calcularDesconto(double valor);
}
