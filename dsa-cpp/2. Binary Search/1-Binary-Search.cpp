/* How to write binary search code :) */
#include<iostream>
using namespace std;

int binarySearch(int arr[], int size, int key){
    int start=0;
    int end=size-1;
    // int mid=(start+end)/2;
    int mid=start+(end-start)/2;

    while(start<=end){
        if(key==arr[mid]){
            return mid;
        }
        else if(key>arr[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=start+(end-start)/2;
    }
    return -1;
}

int main(){
    int even[8]={2, 4, 6, 8, 12, 16, 19, 25};
    int odd[7]={2, 4, 6, 8, 12, 16, 19};

    int index=binarySearch(even, 8, 6);
    cout<<"Index of 6 is : "<<index<<endl;

    index=binarySearch(odd, 7, 19);
    cout<<"Index of 19 is : "<<index<<endl;

}