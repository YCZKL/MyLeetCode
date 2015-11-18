public class Solution {

    public int minSubArrayLen(int s, int[] nums) {

        int left = 0 ; 

        int right = 0;

        

        int min = Integer.MAX_VALUE;

        int sum = 0;

        while(left <= right && right < nums.length){

            sum += nums[right];

            while(sum >= s && left <= right){

                if(right - left + 1 < min)

                    min = right - left + 1;

                sum -= nums[left];

                left++;

            }

            right++;

        }

        if(min == Integer.MAX_VALUE)

            return 0;

        return min;



    }

}
