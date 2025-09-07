/* CodeStudio ::) Binary Search :--> Search in Rotated Sorted array. */
#include<iostream>
using namespace std;
int getPivot(int arr[], int size){
    int start=0, end=size-1;
    int mid=start+(end-start)/2;
    while(start<end){
        if(arr[mid]>=arr[0]){
            start=mid+1;
        }
        else{
            end=mid;
        }
        mid=start+(end-start)/2;
    }
    return start;
}

int binarySearch(int arr[], int size, int key){
    int start=0, end=size-1;
    int mid=start+(end-start)/2;
    while(start<=end){
        if(key==arr[mid]){
            return mid;
        }
        else if(key>arr[mid]){
            start=mid+1;
        }
        else if(key<arr[mid]){
            end=mid-1;
        }
        mid=start+(end-start)/2; 
    }
    return -1;
}

int main(){
    int arr[7]={7,9,12,1,3,5,6};
    int pivot=getPivot(arr, 7);
    int ans=-1;
    int target=5;
    if(arr[pivot]<=target&& arr[6]>=target){
        ans=binarySearch(arr, 7, target);
    }
    else{
        ans=binarySearch(arr, 7, target);
    }
    cout<<ans<<endl;
    return 0;   

}