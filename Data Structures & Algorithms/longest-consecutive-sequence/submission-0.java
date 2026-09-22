class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        List<Integer> res= new ArrayList<Integer>();
        if (nums.length == 0) 
        {
            return 0;
        }

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }

            if(nums[i+1]-nums[i]==1)
            {
                c++;
            }
            else
            {
                res.add(c);
                c=1;
            }

        }
        res.add(c);
        res.sort(Collections.reverseOrder()); 

        return res.get(0);
    }
}
