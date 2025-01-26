package Introducao.Aula01;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        byte idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado!");
        }else {
            System.out.println("Não autorizado!");

        }
        System.out.println("Fora do if e else!");

        if(idade < 15){
            System.out.println("Infantil!");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Juvenil");
        }else {
            System.out.println("Adulto!");
        }


    }
}
