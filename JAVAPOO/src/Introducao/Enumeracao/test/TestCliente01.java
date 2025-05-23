package Introducao.Enumeracao.test;

import Introducao.Enumeracao.dominio.Cliente;
import Introducao.Enumeracao.dominio.TipoCliente;
import Introducao.Enumeracao.dominio.TipoPagamento;

public class TestCliente01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Matheus", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Matheus",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100.0));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClienteNomeRelatorio("PESSOA_FISICA");
        System.out.println(tipoCliente2);


    }


}
