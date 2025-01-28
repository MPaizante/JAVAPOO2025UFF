package Introducao.POO.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("---------------");
        System.out.println("Nome: "+this.nome + ", Idade: "+ this.idade + ", Sexo: "+ this.sexo+".");
        System.out.println("---------------");
    }


}
