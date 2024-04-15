package Exercises.TwoSums;

public class Program {
    public static void main(String[] args) {
        TwoSums twoSums = new TwoSums();
        int[] nums = { 2, 7, 11, 15 };
        int target = 18;
        int[] indices = twoSums.twoSum(nums, target);
        System.out.println("Índices dos números que somam " + target + ": " + indices[0] + ", " + indices[1]);
    }
    
}
