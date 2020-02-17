/**
 * @author DCDD
 * @Description 66. 加一
 * @createTime 2020年01月26日 17:16:00
 */
public class Solution66 {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1 ; i < digits.length; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }else {
                digits[i] = 0;
                if(i == 0){
                    int[] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    for(int j = 1; j < newDigits.length; j++){
                        newDigits[j] = 0;
                    }
                    return newDigits;
                }
            }
        }
        return digits;
    }
}
