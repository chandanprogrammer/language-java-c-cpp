/* Leetcode: 852 ::) Binary Search :--> Peck index in mountain array. */
#include<iostream>
using namespace std;
int peckIndex(int arr[], int size){
    int start=0, end=size-1;
    int mid=start+(end-start)/2;
    while(start<end){
        if(arr[mid]<arr[mid+1]){
            start=mid+1;
        }
        else{
            end=mid;
        }
        mid=start+(end-start)/2;
    }
    return start;
}

int main(){
    
    int arr[7]={7,9,8,4,3,2,1};
    cout<<"Index of Peck Element is : "<< peckIndex(arr, 7) <<endl;
    return 0;

}