/* Code Studio ::) Binary Search :-->  First and Last position of an elements in sorted array. */
#include<iostream>
using namespace std;

int firstOccur(int arr[], int size, int key){
    int start=0, end=size-1;
    int mid=start+(end-start)/2;
    int ans=-1;
    while(start<=end){
        if(key==arr[mid]){
            ans=mid;
            end=mid-1;
        }
        else if(key>arr[mid]){
            start=mid+1;
        }
        else if(key<arr[mid]){
            end=mid-1;
        }
        mid=start+(end-start)/2; 
    }
    return ans;
}

int lastOccur(int arr[], int size, int key){
    int start=0, end=size-1;
    int mid=start+(end-start)/2;
    int ans=-1;
    while(start<=end){
        if(key==arr[mid]){
            ans=mid;
            start=mid+1;
        }
        else if(key>arr[mid]){
            start=mid+1;
        }
        else if(key<arr[mid]){
            end=mid-1;
        }
        mid=start+(end-start)/2; 
    }
    return ans;
}

int main(){
    int arr[15]={1, 2, 4, 8, 16, 16, 16, 16, 16, 16, 16, 24, 44, 199, 200};

    int ans=firstOccur(arr, 15, 16);
    cout<<"First Occurance of 16 is at Index : "<<ans<<endl;

    ans=lastOccur(arr, 15, 16);
    cout<<"Last Occurance of 16 is at Index : "<<ans<<endl;

}