public class Solution {

    public int[] plusOne(int[] digits) {

        int plus=1;

        int tmp;

        for(int i=digits.length-1;i>=0;i--)

        {

            tmp=digits[i];

            digits[i]=(tmp+plus)%10;

            plus=(tmp+plus)/10;

            if(plus==0)

                break;

        }

        if(plus==1)

        {

            int[] result=new int[digits.length+1];

            for(int i=result.length-1;i>=1;i--)

            {

                result[i]=digits[i-1];

            }

            result[0]=plus;

            return result;

        }

        else

            return digits;

    }

}
