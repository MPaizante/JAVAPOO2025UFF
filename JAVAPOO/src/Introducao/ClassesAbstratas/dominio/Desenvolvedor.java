package Introducao.ClassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario){
        super(nome,salario);

    }
    public void calcularBonus(){
        this.salario += this.salario*0.1;
    }
}
