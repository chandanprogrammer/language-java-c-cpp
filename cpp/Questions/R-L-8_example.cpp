#include<iostream>
using namespace std;

int main(){
    int arr[10]={2, 4, 6, 7, 3, 2, 9, 4, 5, 1};
    cout<<"Matching number are : ";
    for(int i=0; i<10; i++){
        for(int j=0; j<10; j++){
            if(i==j){

            }
            else if(arr[i]==arr[j]){
                cout<<arr[i]<<" ";
            }
        }
    }
    return 0;
}






// Swape Alternate Number

// int main(){
//     int arr[8]={1,2,3,4,5,6,7};
//     int z=0;
//     //reverse ke liye loop
//     for(int i=0; i<=4; i++){
//         swap(arr[z], arr[z+1]);
//         z=z+2;
//     }
//     // print krne ke liye loop
//     for(int j=0; j<8; j++){
//         cout<<arr[j] <<" ";
//     }
//     return 0;
// }