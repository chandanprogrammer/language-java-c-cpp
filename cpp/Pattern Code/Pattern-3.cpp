// 1
// 22
// 333
// 4444

#include <iostream>
using namespace std;

int main(){
    int n = 4;
    int row = 1;
    while (row <= n){
        int colm = 1;
        while (colm <= row){
            cout << row;
            colm = colm + 1;
        }
        cout << endl;
        row = row + 1;
    }
}
