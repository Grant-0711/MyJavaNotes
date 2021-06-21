package org.hxl.algorithm;

/**
 * @author Grant
 * @create 2021-06-21 9:08
 */
public class QuickSort {
    public static void qSort(int[] nums ,int start, int end){
        if (start >= end) {
            return;
        }
        int mid = partition(nums,start,end);
        qSort(nums,start, mid-1);
        qSort(nums,mid+1,end);
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int left = start;
        int right = end;
        while (left < right){
            while (left < right && nums[right] >= pivot)
                right--;
            nums[left] = nums[right];
            while (left < right && nums[left] <= pivot)
                left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
}
