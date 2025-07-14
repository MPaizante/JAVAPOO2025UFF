package UFF;

public class Test01 {
    public static boolean hasLetter(String word, char letter){
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){
                return true;

            }

        }
        return false;
    }
    public static int Postion(String word, char letter){
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){
                return i;

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        System.out.println(test01.hasLetter("Matheus",'a'));
        System.out.println(test01.Postion("Matheus",'z'));
    }
}
