/* Linear Search */

#include<iostream>
using namespace std;

int search(int arr[], int size, int key){

    for(int i=0; i<size; i++){
        if(arr[i]==key)
            return true;
    }
    return false;
}

int main(){

    int arr[5]={2, 5, 8, 9, 4};
    int key;
    cout << "Enter your key : ";
    cin >> key;
    bool found = search(arr, 5, key);
    if(found)
        cout << "Key is Present ...";
    else
        cout << "Key is NOT Present ...";

}