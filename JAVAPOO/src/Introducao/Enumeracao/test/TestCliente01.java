package Introducao.Enumeracao.test;

import Introducao.Enumeracao.dominio.Cliente;
import Introducao.Enumeracao.dominio.TipoCliente;

public class TestCliente01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Matheus", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Matheus",TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Matheus",TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Matheus",TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente4);
        System.out.println(cliente2);
        System.out.println(cliente1);
        System.out.println(cliente3);

    }


}
