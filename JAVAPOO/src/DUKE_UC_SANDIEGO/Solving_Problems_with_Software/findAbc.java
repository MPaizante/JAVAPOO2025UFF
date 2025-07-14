package DUKE_UC_SANDIEGO.Solving_Problems_with_Software;

public class findAbc{
    public void TestFindAbc(String input) {
        int index = input.indexOf("abc");
        while (true) {
            if (index == -1) {
                break;
            }
            String found = input.substring(index+1, index+4);
            System.out.println(found);
            index = input.indexOf("abc", index+4);
        }
    }
    public void test() {
        TestFindAbc("abcd");

    }
    public void test2(){
        TestFindAbc("abcdabc");
    }

    public static void main(String[] args) {
        findAbc findAbc1 = new findAbc();
        findAbc1.test2();
    }
}
