/* Code Studio :-) Find Unique */
#include <iostream>
using namespace std;

// XOR (^)  --> concept use 
int findUnique(int arr[], int size){
    int ans=0;
    for(int i=0; i<size; i++){
        ans=ans^arr[i];
    }
    return ans;
}

int main(){

    int arr[8]={4, 6, 7, 4, 7, 6, 1,1};
    int size=8;

    int ans=findUnique(arr, size);
    if(ans==0)
        cout<<"Unique number not present.";
    else
        cout<<"Unique number present.";

}