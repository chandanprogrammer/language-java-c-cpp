/* CodeStudio :-) Intersection of Two Arrays */
//Link:- https://www.codingninjas.com/codestudio/problems/intersection-of-2-arrays_1082149

#include <iostream>
using namespace std;

void intersectionArray(int arr1[], int arr2[], int n, int m){
    int i=0, j=0;
    // vector<int> ans; 
    while(i<n && j<m){
        if(arr1[i]<arr2[j])
            i++;
        else if(arr1[i]==arr2[j]){
            cout<<arr1[i]<<" ";
            // ans.push_back(arr[i]);
            i++;
            j++;
        }
        else
            j++;
    }
    // return ans;
}

int main(){
    int arr1[6]={0, 1, 2, 5, 7, 9 };
    int arr2[5]={1, 1, 5, 8, 9};
    intersectionArray(arr1, arr2, 6, 5);
}