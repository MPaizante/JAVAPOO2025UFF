package Introducao.ModificadorEstatico.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite seu genero M ou F");
        char genero = entrada.next().charAt(0);
        System.out.println(nome+" "+idade+" "+ genero);



    }
}
