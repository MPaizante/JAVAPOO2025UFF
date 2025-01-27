package Introducao.Aula01;

public class Arrys {
    public static void main(String[] args) {

        int [] idades = new int[3];
        idades [0] = 21;
        idades [1] = 15;
        idades [2] = 11;

        System.out.println(idades[1]);

        String [] nomes = new String[3];

        nomes[0] = "Matheus";
        nomes[1] = "Paizante";
        nomes[2] = "Araujo";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        int [] n1= new int[5];
        int [] n2 = {1,2,3,4,5};
        int [] n3 = new int[]{1,2,3,4,5};

        for (int i = 0; i < n2.length; i++) {
            n1[i] = n2[i];
            System.out.println(n1[i]);
        }
        System.out.println("===========================");
        for (int num : n3){
            System.out.println(num);
        }
    }
}
