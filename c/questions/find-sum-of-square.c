/* Write a program to accept any number n and print the sum of square of all numbers from 1 to n */
#include<stdio.h>

int main(){
    int n, square, sum=0;
    printf("Enter a Number : ");
    scanf("%d", &n);
    for(int i=1; i<=n; i++){
        square=i*i;
        sum=sum+square;
    }
    printf("Sum of Square from 1 to %d is : %d", n, sum);
}