/* Swap Alternate 
i/p --> {1, 2, 3, 4, 5, 6}
o/p --> {2, 1, 4, 3, 6, 5}
*/
#include <iostream>
using namespace std;

void printArray(int arr[], int size){
    for(int i =0; i<size; i++){
        cout << arr[i] << " ";
    }
}

void reverseArray(int arr[], int size){
    int start=0, end=1;
    while(end<=size ){ 
        if(start+1<size)
            swap(arr[start], arr[end]);
        start+=2;
        end+=2;
    }
}

int main(){
    int even[8]={4, 7, 9, 2, 5, 0, 8, 1};
    int odd[5]={9, 2, 5, 0, 8};
    
    reverseArray(even, 8);
    printArray(even, 8);

    cout<<endl;

    reverseArray(odd, 5);
    printArray(odd, 5);

    return 0;
}      