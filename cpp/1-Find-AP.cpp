#include <iostream>
using namespace std;

int ar_p(int n){
    int ans = (3*n+7);
    return ans;
}

int main(){
    int n;
    cout << " Enter any number : ";
    cin >> n;
    cout << ar_p(n);
}