class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] a=new int[2];

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)

        {

            map.put(nums[i],i);

        }

        for(int i=0;i<nums.length;i++)

        {

            int d=target-nums[i];

            if(map.get(d)!=null &&map.get(d)!=i)

            {

                a[0]=i+1;

                a[1]=map.get(d)+1;

                break;

            }

        }

        return a;

    }

}
