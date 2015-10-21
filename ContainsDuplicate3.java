c class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        if(k < 1 || t < 0)

            return false;

    TreeSet<Integer> set = new TreeSet<>();

    for(int i = 0; i < nums.length; i++){

      int n = nums[i];

      if(set.floor(n) != null && n <= t + set.floor(n) ||   //ceiling()方法返回set中≥给定元素的最小元素；如果不存在这样的元素，则返回 null

          set.ceiling(n) != null && set.ceiling(n) <= t + n)//floor()方法返set中≤给定元素的最大元素；如果不存在这样的元素，则返回 null

        return true;

      set.add(n);

      if (i >= k)

        set.remove(nums[i - k]);

    }

    return false;

  }



}
