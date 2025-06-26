package AP3.ClassesUtilitarias.Exceções;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        /*try{
            System.out.println(2/0);
            throw new RuntimeException();
        }catch (Exception e ){
            System.out.println("Fechando arquivo.");
            e.printStackTrace();
        }finally {
            System.out.println("Fechando programa!");
        }*/
        abreConexao();
    }
    private static String abreConexao(){
        try{
            System.out.println("Abrindo conexão");
            return  "Aberto conexão.";
        }catch (Exception e ){
            System.out.println("Fechando arquivo.");
            e.printStackTrace();
        }finally {
            System.out.println("Fechando programa!");
        }
        return null;
    }
}
