package Introducao.ModificadorEstatico.dominio;

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(this.professores != null) {
            for (int i = 0; i < this.professores.length; i++) {
                System.out.println(this.professores[i].getNome());

            }
        }else {
            return;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
