package UFF;

public class Sanduiche {
    private String nome;
    private double calorias;
    private int numIngredientes;
    private Ingrediente [] ingredientes;
    private int totalSandiuche;

    public Sanduiche(String nome){
        this.nome = nome;
        this.ingredientes = new Ingrediente[MAX];
        this.numIngredientes = 0;
        this.calorias = 0;
        this.totalSandiuche++;
    }
    public void addIngredientes( Ingrediente ingrediente){
        if (numIngredientes < ingredientes.length){
            ingredientes[numIngredientes] = ingrediente;
        }

    }


}
