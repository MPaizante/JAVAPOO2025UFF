package Introducao.POO.dominio;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    public void imprime(){
        System.out.println("==================================");
        System.out.println("Nome: " + this.nome+"| Idade: "+this.idade + "|Sexo: " + this.sexo);
        System.out.println("==================================");
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade< 0){
            System.out.println("Idade invalida!");
            return;
        }
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public char getSexo(){
        return this.sexo;
    }


}
