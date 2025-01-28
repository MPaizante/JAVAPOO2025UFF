package Introducao.POO.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("---------------");
        System.out.println("Nome: "+estudante.nome + ", Idade: "+ estudante.idade + ", Sexo: "+ estudante.sexo);
        System.out.println("---------------");
    }
}
