public class Solution {

    public boolean isPalindrome(int x) {

        int n=x,a=0;

        if(x<0)return false;

        while(n>0)

        {

            a=a*10+n%10;

            n=n/10;

        }

        return a==x;

    }

}
