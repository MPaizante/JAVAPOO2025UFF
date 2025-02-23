package Introducao.POO.dominio;

import Introducao.Heranca.dominio.Endereco;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, String cpf, Endereco endereco) {
    }

    public Pessoa(String a, String b, String c) {
    }

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
