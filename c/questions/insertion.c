# include <stdio.h>

void display(int arr[], int n){
    // Code for Traversal
    for (int i=0; i<n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int indInsertion(int arr[], int size, int element, int capacity, int index){
    // Code for Insertion
    if(size>=capacity)
    {
        return -1;
    }
    for(int i = size-1; i>=index; i--)
    {
        arr[i+1]=arr[i];
    }
    arr[index]=element;
    return 1;
}

int main(){
     int arr[100]={7,10,34,45,88};
     int size=9, element= 50, index=4, capacity=100;
     display(arr, size);
     indInsertion(arr, size, element, capacity, index);
     size +=1;
     display(arr, size);
     return 0;
}