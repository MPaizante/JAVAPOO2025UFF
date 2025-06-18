public class Test02{
public static boolean hasLetter(String word, char letter){
    for(int i = 0; i<word.length();i++){
        if (word.charAt(i) == letter){
            return true;
        }

    }
    return false;
}
public static void main(String[] args) {
    boolean verdeiro = hasLetter("Matheus", "a");

}

}