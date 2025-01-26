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

        float salAnual = 45000f;
        float primeiraFaixa = 9.70f / 100f;
        float segundaFaixa = 37.35f / 100f;
        float terceiraFaixa = 49.50f /100f;
        float valorImposto;
        if(salAnual <= 34712){
            valorImposto = salAnual *primeiraFaixa;

        } else if (salAnual >34712 && salAnual <= 68507) {
            valorImposto = salAnual * segundaFaixa;
        }else {
            valorImposto = salAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);

        byte dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Erro!");
                break;

        }
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            case 'T':
                System.out.println("Trasngenero");
                break;
            case 'N':
                System.out.println("Prefiro não dizer!");
                break;
            default:
                System.out.println("Ainda não atualizamos, mas iremos inserir mais generos.");
                break;
        }
    }
}
