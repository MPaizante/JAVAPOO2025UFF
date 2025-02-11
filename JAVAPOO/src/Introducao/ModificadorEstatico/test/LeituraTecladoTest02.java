package Introducao.ModificadorEstatico.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Futuro");
        System.out.println("Digite");
        String pergunta = entrada.nextLine();
        if(pergunta.charAt(0)==' '){
            System.out.println("Sim");
        }else {
            System.out.println("Nao");
        }

    }
}
