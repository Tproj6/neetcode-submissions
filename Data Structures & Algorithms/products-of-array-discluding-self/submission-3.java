class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        pre[0]=nums[0];
        post[nums.length-1]=nums[nums.length-1];
        for(int a =1;a<nums.length;a++)
        {
            pre[a]=nums[a]*pre[a-1];
        }
        for(int a =nums.length-2;a>=0;a--)
        {
            post[a]=nums[a]*post[a+1];
        }

        int[] output = new int[nums.length];
        for (int i =0;i<nums.length;i++)
        {
            if(i==0)
            {
                output[i]=1*post[i+1];
            }
            else if(i==nums.length-1)
            {
                output[i]=1*pre[i-1];
            }
            else
            {
                output[i]=pre[i-1]*post[i+1];
            }
        }

        return output;
    }     
} 
