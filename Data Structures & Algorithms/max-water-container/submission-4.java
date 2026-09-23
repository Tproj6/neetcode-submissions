class Solution {
    public int maxArea(int[] heights) {
       
        int res = 0;
        int n = heights.length;
        int l =0;
        int r=n-1;
        while(l<r)
        {
            int w = r-l;
            int len = Math.min(heights[l],heights[r]);
            if(w*len > res)
            {
                res= w*len;
            }

            if(heights[r]>heights[l])
            {
                l++;
            }
            else 
            {
                r--;
            }
            
        }
        int w = r - l;
        int len = Math.min(heights[l],heights[r]);
        if(w*len > res)
        {
            res= w*len;
        }
        return res;
    }
}
