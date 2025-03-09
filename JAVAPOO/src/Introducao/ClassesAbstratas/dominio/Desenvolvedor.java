package Introducao.ClassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario){
        super(nome,salario);

    }

    @Override
    public void imprime() {

    }

    public void calcularBonus(){
        this.salario += this.salario*0.1;
    }
}
