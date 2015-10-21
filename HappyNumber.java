c class Solution {

    public boolean isHappy(int n) {

        HashSet<Integer> hs=new HashSet<Integer> ();

        while(!hs.contains(n))

        {

            hs.add(n);

            n=sum(getDigit(n));

            if(n==1)

            {

                return true;

            }

        }

        return false;

        

    }

    public int sum(int[] a)

    {

        int sum=0;

        for(int i:a)

        {

            sum+=i*i;

        }

        return sum;

    }

    public int[] getDigit(int n)

    {

        String s=String.valueOf(n);

        int[] result=new int[s.length()];

        int i=0;

        while(n>0)

        {

            int m=n%10;

            result[i++]=m;

            n=n/10;

        }

        return result;

    }

}
