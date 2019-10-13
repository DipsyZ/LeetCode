/**
 * 26. 删除排序数组中的重复项
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1 ; j<count ; j ++) {
                if (i + 1 < count) {
                    while (nums[i] == nums[j]) {
                        count -= 1;
                        if(count == j){
                            return count;
                        }
                        if (count == 0) {
                            return 1;
                        }
                        for (int h = j; h < count; h++) {
                            nums[h] = nums[h + 1];
                        }
                        nums[count] = nums[i];
                        if (nums[i] != nums[i + 1]) {
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        int[] nums = new int[]{1,1,2};
//        int count = new Solution().removeDuplicates(nums);
//    }

}
