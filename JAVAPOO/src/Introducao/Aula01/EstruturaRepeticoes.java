package Introducao.Aula01;

public class EstruturaRepeticoes {
    public static void main(String[] args) {
        byte count = 0;
        while (count <10){
            System.out.println(count);
            count++;
        }

        do {
            System.out.println("Print do 'do-while'!");
        }while (count < 10);

        for (byte i = 0; i < count  ; i++){
            System.out.println("Contar: "+ i);
        }

        for (byte i = 1; i <= 50 ;i++ ){
            System.out.println("i: "+i);
            if( i == 25){
                break;
            }
        }
        double valorTotal = 30000;
        for (double parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcerla = valorTotal / parcela;
            if (valorParcerla < 1000){
               break;
            }
            System.out.println("Parcela: " + parcela + " reais "+valorParcerla);
        }
        








    }
}
