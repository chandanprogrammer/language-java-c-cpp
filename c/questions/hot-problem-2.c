/* Write a Program to enter a number and test whether it is a fibonacci number or not. */
#include <stdio.h>

int main()
{
    int num, a = 0, b = 1, c;
    printf("Enter a Number : ");
    scanf("%d", &num);
    while (a <= num)
    {
        printf("Enter in Loop\n");
        if (a == num)
        {
            printf("It is Fibonacci Number \n");
            break;
        }
        c = a + b;
        a = b;
        b = c;
    }
    if (a != num)
    {
        printf("It is not Fibonacci Number \n");
    }
}