#include <iostream>
using namespace std;

void sortArray(int arr[], int size){
    int s=0, e=size-1;
    // jaise hi i>=j se to loop ko rokna hai..
    while(s<e){
        if(arr[s]==0)
            s++;
        if(arr[e]==1)
            e--;
        if(arr[s]==1 && arr[e]==0){
            swap(arr[s], arr[e]);
            s++;
            e--;
        }
    }
}

void printArray(int arr[], int size){
    for(int i=0; i<size; i++){
        cout<<arr[i]<<" ";
    }
}

int main(){
    int arr[18]={0,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,0,0};
    sortArray(arr, 18);
    printArray(arr, 18);
}