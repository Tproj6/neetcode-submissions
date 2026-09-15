class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap <>();

        for(int i=0;i<nums.length;i++)
        {
            int d = nums[i];
            if (map.containsKey(d))
            {
                return true;
            }

            map.put(d,i);
        }

        return false;
    }
}