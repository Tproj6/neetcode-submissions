class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder ();
        int max = 0;
        for(int i =0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            int dup=sb.indexOf(String.valueOf(c));
            if(dup!= -1)
            {
                sb.delete(0,dup+1);
            }
            sb.append(c);
            max=Math.max(max, sb.length());
        }
        return max;
    }
}
