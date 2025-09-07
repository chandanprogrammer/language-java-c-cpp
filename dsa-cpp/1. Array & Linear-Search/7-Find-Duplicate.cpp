/* Code Studio :-) Find Duplicate */
// n size of array --> 1 to n-1 and one number repeatso, find repeat number
#include <iostream>
using namespace std;

int findDuplicate(int arr[], int size){
    int ans=0;
    for(int i=0; i<size; i++){
        ans=ans^arr[i];
    }
    for(int i=0; i<size; i++){
        ans=ans^i;
    }
    return ans;
}
// int findDuplicate(int arr[], int size){
//     int ans1=0,ans2=0;
//     for(int i=0; i<size; i++){
//         ans1=ans1+arr[i];
//     }
//     for(int i=1; i<size; i++){
//         ans2=ans2+i;
//     }
//     return ans1-ans2;
// }
int main(){
    int arr[6]={1, 3, 2, 5, 4, 4};
    int ans = findDuplicate(arr, 6);
    cout << "Duplicate Number is --> "<<ans<<endl;
    return 0;
}