/* Reverse Array */
#include <iostream>
using namespace std;

int reverseArray(int arr[], int size){
    int start=0, end=size-1;
    while(start<=end){
        swap(arr[start], arr[end]);
        start++;
        end--;
    }
    return arr[6];
}

int main(){

    int arr[6]={4, 7, 9, 2, 5, 0};

    // Function call
    reverseArray(arr, 6);

    // Print New Array 
    for(int i =0; i<6; i++){
        cout << arr[i] << " ";
    }
    return 0;
}