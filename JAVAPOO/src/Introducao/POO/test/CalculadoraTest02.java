package Introducao.POO.test;

import Introducao.POO.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiDoisNumeros(10.9852f,20.458f);
        double res = calculadora.divideDoisNumeros(21,2);
        System.out.println(res);


    }
}
