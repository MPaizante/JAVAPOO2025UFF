package DUKE_UC_SANDIEGO.Solving_Problems_with_Software;

public class myFunction {
    public int myFunc(int x, int y){
        int z = 2 * x - y;
        return z * x;
    }
    public int f(int n ){
        return 3 + myFunc(n,n+1);
    }
    public int funcFinal(){
        int a;
        a = myFunc(3,7);
        int b = f(a*a);
        return b;
    }
    public void imprime(){
        System.out.println(funcFinal());
    }

    public static void main(String[] args) {
        myFunction valor = new myFunction();
        valor.imprime();
    }
}
