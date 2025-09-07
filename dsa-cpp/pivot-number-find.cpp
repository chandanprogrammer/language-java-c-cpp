/* Binary Search :--> Find pivot in array. */
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

int main(){
    
    int arr[9]={7,8,9,16,1,2,3,4,5};
    cout<<"Pivot Element Index is : "<<getPivot(arr, 9)<<endl;
    return 0;

}