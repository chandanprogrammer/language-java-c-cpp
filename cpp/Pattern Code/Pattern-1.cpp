// 1234554321
// 1234**4321
// 123****321
// 12******21
// 1********1

#include <iostream>
using namespace std;

int main(){
    int n;
    int i = 1;
    cout << "enter any number :" << endl;
    cin >> n;
    while (i <= n){
        int j = 1;
        while (j <= n){
            if (j <= n - i + 1){
                cout << j;
            }
            else{
                cout << "*";
            }
            j++;
        }
        j--;
        while (j >= 1){
            if (j >= n - i + 2){
                cout << "*";
            }
            else{
                cout << j;
            }
            j--;
        }
        cout << endl;
        i++;
    }
}

