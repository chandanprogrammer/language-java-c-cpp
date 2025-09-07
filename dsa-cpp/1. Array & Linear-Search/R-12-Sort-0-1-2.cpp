/*CodeStudio:-) Sort 0 1 2*/
// Link:- 

#include <iostream>
using namespace std;

void sortArray(int arr[], int size){
    int s=0, e=size-1;
    while(s<e){
        if(arr[s]==0)
            s++;
        if(arr[e]==2)
            e--;
        if(arr[e]==1){
            swap(arr[s], arr[s+1]);
            s+=2;
        }
            
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
    int arr[8]={0,1,2,0,1,2,0,1};
    //sortArray(arr, 8);
    sort(arr.begin(), arr.end());
    printArray(arr, 8);
}