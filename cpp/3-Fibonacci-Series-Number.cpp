#include<iostream>
using namespace std;

int fib(int n){
    int a=0, b=1;
    cout << a << " " << b << " ";
    for(int i=1; i<n; i++){
        int c = a+b;
        cout << c << " " ; 
        a = b;
        b = c;
    }
}

int main(){
    int n;
    cout << "Kitna term ko print krna hai number type kijiye : ";
    cin >> n;
    fib(n-1);
}