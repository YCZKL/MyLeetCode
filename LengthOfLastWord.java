public class Solution {

    public int lengthOfLastWord(String s) {

        if(s.length()==0)

            return 0;

        String[] ss=s.trim().split(" ");

        return ss[ss.length-1].length();

    }

}
