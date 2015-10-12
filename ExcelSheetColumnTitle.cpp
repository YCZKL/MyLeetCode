#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
class Solution {
public:
    string convertToTitle(int n) {
      if(n < 1)
            return "";
        else
        {
            string result = "";
            while(n)
            {
                n --;
                char c = n%26 + 'A';
                result += c;
                n /= 26;
            }
            reverse(result.begin(), result.end());
            return result;

        }

    }
};
int main()
{
    Solution s;

    string a=s.convertToTitle(92);
    cout<<a<<endl;
    return 0;
}
