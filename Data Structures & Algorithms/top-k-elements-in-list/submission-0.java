class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap <Integer, Integer> map = new HashMap <>();
     for(int i : nums)
     {
        map.merge(i, 1 , Integer::sum);
     }   

     List <Integer> res = new ArrayList<>(map.keySet());
     res.sort((a,b) -> map.get(b) - map.get(a));

     int[] result = new int [k];

     for(int i=0;i<k;i++)
     {
        result[i]=res.get(i);
     }

     return result;
    }
}
