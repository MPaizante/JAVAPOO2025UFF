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
    int h( int x, int y){
        if(x <y) {
            System.out.println("x < y");
            return x*y;
        }
        else {
            System.out.println("x > = y");
            if(x>8){
                return y+7;
            }
        }
        return x-2;
    }
     int t(){
        int a = h(3,4);
        int b = h(a,5);
        return b;
    }
    public static void main(String[] args) {
        myFunction valor = new myFunction();
        valor.imprime();
        valor.t();
    }
}
