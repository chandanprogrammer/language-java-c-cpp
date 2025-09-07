/* L-5 ---> Question-57. ----> Write a Program to find out the value of X raised to the Power Y , where X and Y are Positive integers. */ 

// Write a Exponential without pow function in C language.

#include<stdio.h>
#include<conio.h>

// m^n=m*m*m*m.......*n times
// 2^4 = 2*2*2*2=16
// [2,4] val=1; loop-->> 4(n); val=val*m

int main(){
    int m=6, n=2;
    long long int val=1;
    for (int i = 0; i < n; i++)
    {
        val=val*m;
    }
    printf("The value of %d to the power %d is %lld", m, n, val);
    getch();
    return 0;
}