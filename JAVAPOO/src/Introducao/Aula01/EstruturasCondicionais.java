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
    }
}
