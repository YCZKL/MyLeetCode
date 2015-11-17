public class Solution {

    public int[] singleNumber(int[] nums) {

        int[] a=new int[2];

        Arrays.sort(nums);

        int i=0,j=0;

        while(i<nums.length){

            if(i<(nums.length-1)&&nums[i]==nums[i+1]){

                i+=2;

            }else

            {

                a[j]=nums[i];

                j++;

                i++;

            }

        }



        return a;

    }

}
