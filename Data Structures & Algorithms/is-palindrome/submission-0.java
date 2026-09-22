class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sp = new StringBuilder();
        for(char c : s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                sp.append(Character.toLowerCase(c));
            }
        }
        return sp.toString().equals(sp.reverse().toString());
    }
}
