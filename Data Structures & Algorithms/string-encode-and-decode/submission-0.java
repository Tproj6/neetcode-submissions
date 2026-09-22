class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        //

        for(String p : strs)
        {
            s.append(p.length()).append("?").append(p);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> sp = new ArrayList<String>();
        int i=0;
        while(i !=str.length())
        {
            int qs = str.indexOf("?",i);

            int len = Integer.parseInt(str.substring(i,qs));

            int start = qs+1;

            sp.add(str.substring(start,start+len));

            i=start+len;
           
        }

        return sp;
    }
}
