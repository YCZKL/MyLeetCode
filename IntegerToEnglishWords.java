class Solution {

    public String numberToWords(int num) {

         String[] weight={""," Thousand"," Million"," Billion"};  

         String[] table={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",  

         "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};  

         String[] tens={"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};  

         StringBuffer sb=new StringBuffer();  

  

         if(num==0)  //num=0  

              return table[0];  

              

         for(int i=0;num!=0;num/=1000,++i)  

         {  

            int n=num%1000;  

            int tmp;  

  

            if(n!=0)    //weight  

               sb.insert(0,weight[i]);  

             

            tmp=n%100;  //the last two digits  

            if(tmp>0 && tmp<20)  

                sb.insert(0,table[tmp]);  

            else if(tmp>=20)  

            {  

              if(tmp%10!=0)  

                   sb.insert(0," "+table[tmp%10]);  

 

               sb.insert(0,tens[tmp/10-2]);  

            }  

  

 

            tmp=n/100;  //the first digit  

            if(tmp!=0)  

            {  

                if(n%100!=0)  

                    sb.insert(0," ");  

                sb.insert(0,table[tmp]+" Hundred");  

            }  

  

            if(n!=0 && num/1000!=0)  

               sb.insert(0," ");  

        }  

  

        return sb.toString();  



    }

}
