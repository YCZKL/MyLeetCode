ass Solution {

public:

    bool isStr(char &ch)

    {

        if(ch>='a'&&ch<='z')

            return true;

            else if(ch>='0'&&ch<='9')

                return true;

                else if(ch>='A'&&ch<='Z')

                {

                    ch+=32;

                    return true;

                }

                return false;

                    

    }

    bool isPalindrome(string s) {

        int len=s.length();

        if(len==0)

            return true;

            string str="";

            for(int i=0;i<len;i++)

            {

                if(isStr(s[i]))

                    str+=s[i];

            }

            len=str.length();

            int mid=(len+1)/2;

            for(int i=0;i<mid;i++)

            {

                if(str[i]!=str[len-i-1])

                    return false;

            }

            return true;

        

    }

};
