public class Solution {

    public int divide(int dividend, int divisor) {

        if(divisor == 0)

        {

            return Integer.MAX_VALUE;

        }

        boolean isNeg = (dividend^divisor)>>>31 == 1;//以上句子无符号右移一位！是以二进制代码进行的！ ^为异或运算

        int res = 0;

        if(dividend == Integer.MIN_VALUE)  

        {  

            dividend += Math.abs(divisor); //因为测试数据出现了-2147483648，还不能把它转成正的(2147483648就溢出了）,所以提前加上一个除数 

            if(divisor == -1)  

            {  

                return Integer.MAX_VALUE;  

            }  

            res++;  

        }

         if(divisor == Integer.MIN_VALUE)

        {

            return res;//这里除数的绝对值已经为最大了，任何数除以这个数，结果的绝对值最终都会小于1 ，取整就是0喽

        }

        dividend = Math.abs(dividend);

        divisor = Math.abs(divisor);

        int digit = 0;

        while(divisor <= (dividend>>1))

        {

            divisor <<= 1;

            digit++;

        }

        while(digit>=0)

        {

            if(dividend>=divisor)

            {

                res += 1<<digit;//(res=res+(1*2^digit))--->结果增加加2^k

                dividend -= divisor;

            }

            divisor >>= 1;

            digit--;

        }

        return isNeg?-res:res;



    }

}
