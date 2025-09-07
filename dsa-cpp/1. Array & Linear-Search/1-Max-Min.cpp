#include <iostream>
using namespace std;

int getMin(int num[], int size){
    int min = INT_MAX;
    for (int i = 0; i < size; i++){
        if (num[i] < min){
            min = num[i];
        }
    }
    return min;
}
int getMax(int num[], int size){
    int max = INT_MIN;
    for (int i = 0; i < size; i++){
        if (num[i] > max){
            max = num[i];
        }
    }
    return max;
}

int main()
{
    int size;
    cout << "Enter Size of Array : ";
    cin >> size;
    int num[100];
    cout << "Input Array"<<endl;
    for (int i = 0; i < size; i++){
        cin >> num[i];
    }
    cout << "Maximum : "<<getMax(num, size) <<endl;
    cout << "Minimum : "<<getMin(num, size);
}