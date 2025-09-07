// Write a Program to find a integer Number and Find nearest integer number divisible by 15.
#include<stdio.h>
#include<conio.h>

int main(){
    int num, rem;
    // clrscr();
    printf("Enter any Number: \n");
    scanf("%d", &num);
    rem = num % 15;
    if (rem > 7.5){
        num = (num/15 + 1)*15;
    }
    else{
        num = (num/15 )*15;
    }
    printf ("The nearest number of given integer divisible by 15 is %d ", num);
    getch();
    return 0;
}