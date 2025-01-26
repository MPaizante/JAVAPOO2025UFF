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

        int salario = 6000;
        String mensagemDoar = "Vou dar meu dinheiro!";
        String mensagemNaoDoar = "Ainda não doar!";
        String mensagem = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;//ternario
        System.out.println(mensagem);

        if (salario > 5000){
            mensagem = mensagemDoar;
        }else {
            mensagem = mensagemNaoDoar;
        }
        System.out.println(mensagem);




    }
}
