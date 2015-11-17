c class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] a=new int[2];

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)

        {

            map.put(nums[i],i);

        }

        for(int i=0;i<nums.length;i++)

        {

            int gap=target-nums[i];

            if(map.get(gap)!=null&&map.get(gap)!=i)

            {

                a[0]=i+1;

                a[1]=map.get(gap)+1;

                break;

            }

        }

        return a;

    }

}
