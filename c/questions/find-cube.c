/* Write a program to accept any number n and print the cube of all numbers from 1 to n which are divisible by 3. Rewrite the program using a continue statements. */
#include<stdio.h>

int main(){
    int n;
    printf("Enter a Number : ");
    scanf("%d", &n);
    for(int i=1; i<=n; i++){
        if(i%3==0){
            printf("Cube of %d is %d \n",i, i*i*i);
        }
    }
}

// int main(){
//     int n;
//     printf("Enter a Number : ");
//     scanf("%d", &n);
//     for(int i=3; i<=n; i=i+3){
//             printf("Cube of %d is %d \n",i, i*i*i);
//     }
// }