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

    public static void main(String[] args) {
//        int[] nums = new int[]{1,1,2};
//        int count = new Solution().removeDuplicates(nums);

        Integer i = new Integer(100);
        Integer j = new Integer(100);
        Integer a = 100;
        int b = 100;
        System.out.println(i.equals(j));
        System.out.println("i:hashcode" + i.hashCode());
        System.out.println("j:hashcode" + j.hashCode());
        System.out.println(i.equals(a));
        System.out.println(i.equals(b));
        System.out.println(a.equals(b));

        Object o = new Object();
        o.hashCode();
    }

}
