package UFF.For;

public class TestFor {
    public static String replaceWord(String word, char gone, char here){
        char [] cArray = word.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            if (cArray[i] == gone) {
                cArray[i] = here;
            }

        }
        return new String(cArray);
    }

    public static void main(String[] args) {
        String word = "Matheus";
        String word2 = replaceWord("Matheus",'a','i');
        System.out.println(word.replace("a","i"));
        System.out.println(word2);
    }
}
