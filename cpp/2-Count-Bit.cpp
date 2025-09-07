#include<iostream>
#include <math.h>
using namespace std;

int binary(int num){
    int result=0, bit, i=0;
    while(num !=0){
        bit = num % 2;
        result = bit * pow(10, i) + result;
        num = num/2;
        i++;
    } 
    return result;
}

int bit_count(int bit){
    int count = 0, rem;
    while (bit!=0){
        rem = bit%10;
        if(rem==1){
            count ++;
        }
        bit = bit/10;
    }
    return count;
}

int main(){
    int a, b;
    cout << "Enter any two number : ";
    cin >> a >> b;
    int num1=binary(a);
    int num2=binary(b);
    int ans  = bit_count(num1)+bit_count(num2);
    cout<<ans;
}