package Arrays;

import java.util.HashMap;

/**
 * Brute Force -------
 * O(n^2)
 *
 *
 public class MajorityElement {
    public static int majorSearch(int nums[], int n) {
        for(int i = 0; i < n - 1; i++) {
            int count = 0;
            for(int j = 0; j < n - 1; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > n/2) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2 ,1 , 1 , 1 , 1 , 2 , 2 , 2};
        int n = nums.length/2;
        int res = majorSearch(nums, n);
        if(res != -1) {
            System.out.println("Major Element : "+res);
        }else {
            System.out.println("Not Found");
        }
    }
}
 **/


public class MajorityElement {
    public static int majorElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num) > n/2) {
                return num;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int nums[] = {1 , 2 , 2 , 2 , 2 , 2, 1};
        int res = majorElement(nums);
        if(res != -1){
            System.out.println("Major Number is : "+res);
        }
        else {
            System.out.println("Not Found");
        }
    }
}

