package Introducao.ClassesAbstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome,salario);
    }
    public void calcularBonus(){
        this.salario += this.salario*0.05;
    }
    @Override
    public void imprime() {

    }
}
