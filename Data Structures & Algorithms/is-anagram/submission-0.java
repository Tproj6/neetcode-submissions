class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> maps = new HashMap<>();
        HashMap <Character, Integer> mapt = new HashMap<>();

        if (s.length()!=t.length())
        {
            return false;
        }

        for (int i =0; i< s.length();i++)
        {
            maps.put(s.charAt(i),maps.getOrDefault(s.charAt(i),0) +1);
            mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i),0) +1);
        }

        return maps.equals(mapt);
    }
}
