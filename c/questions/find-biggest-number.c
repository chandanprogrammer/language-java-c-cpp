// Program to find biggest number from three given numbers.
#include <stdio.h>

int main()
{
    int num1, num2, num3;
    printf("Enter your first number:\n");
    scanf("%d", &num1);
    printf("Enter your second number:\n");
    scanf("%d", &num2);
    printf("Enter your third number:\n");
    scanf("%d", &num3);
    if (num1 > num2 && num1 > num3)
    {
        printf("The Greatest number is %d \n", num1);
    }
    else if (num2 > num1 && num2 > num3)
    {
        printf("The Greatest number is %d \n", num2);
    }
    else if (num3 > num1 && num3 > num2)
    {
        printf("The Greatest number is %d \n", num3);
    }
    else
    {
        printf("Invalid Input \n");
    }

    return 0;
}