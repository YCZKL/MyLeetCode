public class Solution {

    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> map=new HashMap<>();

        char[] ss=s.toCharArray();

        char[] ts=t.toCharArray();

        if(s.length()!=t.length())

            return false;

        for(int i=0;i<s.length();i++)

        {

            

            if(map.containsKey(ss[i]))

            {

                char a=map.get(ss[i]);

                if(a!=ts[i])

                {

                    return false;

                }

                

            }

            else

            {

                if(map.containsValue(ts[i]))

                {

                    return false;

                }

                map.put(ss[i],ts[i]);

            }

        }

        return true;

        

    }

}
