#include<iostream>
#include<math.h>
using namespace std;

int main(){
    int num = -5;
    int tempNum = -(num);
    
    int ans=0, i=0;
    while(tempNum!=0){
        int bit =tempNum & 1;
        ans = (bit * pow(10, i) + ans);
        ans = ~ans;
        tempNum=tempNum>>1;
        i++;
    }
    cout<<"Answer is : " << ans <<endl;

   // cout<<complement<<endl;
}