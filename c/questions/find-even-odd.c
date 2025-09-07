#include<stdio.h>

void main(){
    int num, ans;
    printf("Please enter any number : \n");
    scanf("%d", num);
    ans=num%2;
    switch(ans){
        case 1:
            printf("Number is odd");
            break;
        default:
            printf("Number is even");
    }
}