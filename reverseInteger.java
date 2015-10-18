public class Solution {

    public int reverse(int x) {

        int a=x,r=0;

        if(a==0)return 0;

        if(a>0)

        {

            while(a>0)

            {

                r=r*10+a%10;

                a=a/10;

            }

        }

        if(a<0)

        {

            while(a<0)

            {

                r=r*10+a%10;

                a=a/10;

            }

        }

        return r;

    }

}
