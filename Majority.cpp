#include <iostream>
#include <vector>
#include <string>
#include <ctime>
#include <stdlib.h>
using namespace std;
class Solution {
public:
    int majorityElement(vector<int> &num) {
         int cnt=0;
         for(;;){
            if(num.size()==1)
                return num[0];
             else    {
                 int i=rand()%(num.size()-1);
                for(int j=0; j<num.size();j++) {
                    if(num[j] == num[i])
                       cnt++;
                }
                 if(cnt>(num.size()/2))
                   return num[i];
               else    {
                   cnt = 0;
                   continue;
                }
          }
        }
        }
};
int main()
{
	Solution s;
	vector<int> a(3);
	a[0]=3;
	a[1]=2;
	a[2]=4;
	int num=s.majorityElement(a);
	cout<<"return num ="<<num<<endl;
	return 0;
}
