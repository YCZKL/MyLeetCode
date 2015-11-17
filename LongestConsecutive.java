c class Solution {

    public int longestConsecutive(int[] nums) {

        //要求是O(n)意味着不能用排序，因为排序复杂度为O(nlogn)

        //可以用一个哈希表

        if(nums.length==0)

        {

            return 0;

        }

        int max=1;

        Set<Integer> set=new HashSet<Integer> ();

        for(int i:nums)

        {

            set.add(i);

        }

        for(int i:nums)

        {

            int left=i-1;

            int right=i+1;

            int count=1;

            while(set.contains(left))

            {

                count++;

                set.remove(left);

                left--;

            }

            while(set.contains(right))

            {

                count++;

                set.remove(right);

                right++;

            }

            max=Math.max(count,max);

            

        }

            

        

        return max;

    }

}
