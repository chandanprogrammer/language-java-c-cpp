/*CodeStudio:-) Pair Sum*/
// Link:- https://www.codingninjas.com/codestudio/problems/pair-sum_697295

#include<iostream>
using namespace std;

// to solve question then use vector concept....

void pairSum(int arr[], int size, int target){
    for(int i=0; i<size; i++){
        for(int j=i; j<size; j++){
            if(arr[i]+arr[j]==target){
                cout<<arr[i]<<" "<<arr[j]<<endl;
                break;
            }
        }
    }
}

int main(){
    int arr[10]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int target=5;
    pairSum(arr, 6, target);
}