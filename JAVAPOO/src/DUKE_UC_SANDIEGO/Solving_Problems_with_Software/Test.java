package DUKE_UC_SANDIEGO.Solving_Problems_with_Software;

public class Test {
    public static void main(String[] args) {
        String s = "2314511167";
        String[] nums = s.split("1+");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
