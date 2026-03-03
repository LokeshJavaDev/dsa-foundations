package HashMap;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)) {
                return true;
            }
            else {
                map.put(num,1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2};
        boolean res = containsDuplicate(nums);
        System.out.println("Contains Duplicate: "+res);
    }
}
