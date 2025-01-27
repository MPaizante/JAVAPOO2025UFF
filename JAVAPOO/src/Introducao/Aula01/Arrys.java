package Introducao.Aula01;

public class Arrys {
    public static void main(String[] args) {

        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println(idades[1]);

        String[] nomes = new String[3];

        nomes[0] = "Matheus";
        nomes[1] = "Paizante";
        nomes[2] = "Araujo";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }

        int[] n1 = new int[5];
        int[] n2 = {1, 2, 3, 4, 5};
        int[] n3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < n2.length; i++) {
            n1[i] = n2[i];
            System.out.println(n1[i]);
        }
        System.out.println("===========================");
        for (int num : n3) {
            System.out.println(num);
        }
        System.out.println("=====================");
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;
        dias[2][0] = 31;
        dias[2][1] = 30;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }

        }


        System.out.println("============================");

        for (int[] num : dias) {
            for (int n : num) {
                System.out.println(n);
            }
        }


        int[][] arryInt = new int[3][];
        arryInt[0] = new int[2];
        arryInt[1] = new int[3];
        arryInt[2] = new int[6];

        int [][] arrayI = {{1,2},{3,4,5},{6,7,8,9,10,11,12}};

        for (int i = 0; i < arryInt.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < arryInt[i].length; j++) {
                System.out.print(arryInt[i][j]);
            }
        }


    }
}
