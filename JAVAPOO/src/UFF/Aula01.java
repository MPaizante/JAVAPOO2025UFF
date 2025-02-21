package UFF;

public class Aula01 {
    int x;
    int y;
    static int proximo_id = 0;
    int id;

    Aula01(){
        id = proximo_id++;
    }


    void move(int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;

    }

    public static void main(String[] args) {
        Aula01 p = new Aula01();
        p.move(9,3);
        System.out.println("Os pontos são: x = 0"+p.x +" y = "+p.y);
        p.x = 0;
        System.out.println("Os pontos são: x = 0"+p.x +" y = "+p.y);
        Aula01 l = new Aula01();
        Aula01 c = new Aula01();
        System.out.println(p.id);
        System.out.println(l.id);
        System.out.println(c.id);
    }
}
