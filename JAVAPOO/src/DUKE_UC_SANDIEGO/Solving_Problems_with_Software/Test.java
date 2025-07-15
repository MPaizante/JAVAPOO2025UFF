package DUKE_UC_SANDIEGO.Solving_Problems_with_Software;

public class Test {
    public static void main(String[] args) {
        String s = "2314511167";
        String[] nums = s.split("1+");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        String text = "Hello";
        text = text.concat(" World!");
        System.out.println(text);
        String text1 = "Practice, practice, practice!";
        System.out.println(text1.indexOf("prac"));
        String text2 = "Hurray!!#! It's Friday! finally...";
        String[] words = text2.split("!+");
        for (String n : words){
            System.out.print(n +" ");
        }

    }
}
