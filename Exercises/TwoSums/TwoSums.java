package Exercises.TwoSums;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complementos = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (complementos.containsKey(complemento)) {

                return new int[] { complementos.get(complemento), i };
            }

            complementos.put(nums[i], i);
        }


        throw new IllegalArgumentException("Nenhum par encontrado para o target fornecido.");
    }

    public static void main(String[] args) {
        TwoSums twoSums = new TwoSums();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] indices = twoSums.twoSum(nums, target);
        System.out.println("Índices dos números que somam " + target + ": " + indices[0] + ", " + indices[1]);
    }
}
