package Introducao.POO.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
        System.out.println("Calculo Finalizado!");
    }

    public void subDoisNumeros() {
        System.out.println(10 - 15);
        System.out.println("Calculo Finalizado!");
    }

    public void multiDoisNumeros(float a, float b) {
        float res = a * b;
        System.out.println("Multiplicação entre " + a + " e " + b + " : " + res);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }

    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error!");
            return;
        }
        System.out.println(num1 / num2);
        return;

    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do Altera Dois Numeros!");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

}
