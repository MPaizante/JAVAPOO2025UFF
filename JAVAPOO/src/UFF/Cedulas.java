package UFF;

public class Cedulas {
    private int [] notas;
    private int numNotas;
    private int totalNotas;
    public Cedulas(int totalNotas){
        this.totalNotas = totalNotas;
        this.numNotas = 0;
        this.notas = new int[totalNotas];

    }
    public void addNotas(int nota){
        if(this.numNotas <this.totalNotas){
            this.notas[numNotas] = nota;
            this.numNotas++;
        }
    }
    public void calcularNotas(int valor){
        int contNotas;
    }
}
