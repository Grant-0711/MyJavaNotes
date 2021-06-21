package org.hxl.algorithm;

/**
 * @author Grant
 * @create 2021-06-21 11:06
 */
public class TestAlgorithm {
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,6,9,3,7,2,8,22};
        QuickSort.qSort(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
