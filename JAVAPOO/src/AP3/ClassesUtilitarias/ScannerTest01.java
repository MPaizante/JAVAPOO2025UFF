package AP3.ClassesUtilitarias;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Matheus Paizante Araujo";
        String [] nomes = texto.split(" ");
        for(int i = 0 ; i < nomes.length ; i++){
            System.out.println(nomes[i]);
        }
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(" ");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }
}
