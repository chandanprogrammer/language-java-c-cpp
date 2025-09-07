// Write a C program to calculate factorial of a number.
#include<stdio.h>
#include<conio.h>

// Iterative Approach Function
// factorial [n] = n * (n-1) * (n-2) * (n-3) ..... * (1)
// Eg:- factorial [5] = 5*4*3*2*1 = 120
int factorialIterative(int n)
{
    int val = 1;
    for (int i = n; i > 1; i--)
    {
        val = val * i;
    }
    return val;
}

// Recursive Approach Function
// fac(6) = 6*5*4*3*2*1 = 6*fac(5)
// fac(5) = 5*fac(4)
// fac(n) = n*fac(n-1) ------>> Recursive Relationship , where (n>=1), [fac(0)=1] 
int factorialRecursive(int n)
{
    if (n == 0 || n == 1)
    {
        return 1;
    }
    else
    {
        return n * factorialRecursive(n-1);
    }
}

// Main program start here........
int main()
{
    int n;
    printf("Enter the value of number for factorial calculation: \n");
    scanf("%d", &n);
    // int fact= factorialIterative(n);
    int factorial = factorialRecursive(n);
    printf("The value of factorial is %d \n", factorial);
    getch();
    return 0;
}

