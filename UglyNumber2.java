public class Solution {

    public int nthUglyNumber(int n) {

        SortedSet<Long> s1=new TreeSet<>();

        s1.add((long)1);

        long result=s1.first();

        for(int i=0;i<n;i++)

        {

            result=s1.first();

            s1.add(result*2);

            s1.add(result*3);

            s1.add(result*5);

            s1.remove(result);

        }

        return (int)result;

    }

   

}
