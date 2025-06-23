package AP3.ClassesUtilitarias;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Matheus";
        String nome2 = "Matheus";
        System.out.println(nome2 == nome);
        String nome3 = new String("Matheus");
        System.out.println(nome3.equals(nome2));

        SmartPhone smartPhone1 = new SmartPhone("1ABC1", "Iphone");
        SmartPhone smartPhone2 = new SmartPhone("1ABC1", "Pixel");
        System.out.println(smartPhone2.equals(smartPhone1));
        System.out.println(smartPhone2.getSerialNumber().equals(smartPhone1.getSerialNumber()));
    }
}
