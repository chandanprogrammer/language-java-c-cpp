#include <iostream>
using namespace std;

int main()
{

    int a, b, res=1;
    cout<<"Enter first number : ";
    cin>>a;
    cout<<"Enter second number : ";
    cin>>b;
    for(int i=1; i<=b; i++){
        res *=a;
    }
    cout<<"Power : "<<res;

    // int num, fact = 1;
    // cout << "Enter a number : ";
    // cin >> num;

    // for (int i = 1; i <= num; i++)
    // {
    //     fact = fact*i;
    // }
    // cout << "Factoril : " << fact;

    // int num, sum = 0;
    // cout << "Enter a number : ";
    // cin >> num;
    // for (int i = 1; i <= num; i++)
    // {
    //     (i % 2 == 0) ? sum -= i : sum += i;
    // }
    // cout << "Sum : " << sum;

    // int num, rem, newNum=0;
    // cout<<"Enter a number : ";
    // cin>>num;
    // while(num>0){
    //     rem = num%10;
    //     newNum = newNum*10+ rem;
    //     num = num/10;
    // }
    // cout<<"New Reverse Number : "<<newNum;

    // int num, rem, sum=0;
    // cout<<"Enter a number : ";
    // cin>>num;
    // while(num>0){
    //     rem = num%10;
    //     sum = sum + rem;
    //     num = num/10;
    // }
    // cout<<"Sum : "<<sum;

    // int num, count=0;
    // cout<<"Enter a number : ";
    // cin>>num;
    // while(num>0){
    //     num = num/10;
    //     count++;
    // }
    // cout<<"Total Digit in number - "<<num <<" is "<<count;
    return 0;
}
