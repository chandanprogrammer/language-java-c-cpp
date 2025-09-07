// Wrire a Program to Generate Multiplication Table of a Given Number:
#include <stdio.h>

int main()
{
    int num;
    printf("Enter the value of number whose multiplication table is to be printed\n");
    scanf("%d", &num);
    printf("The multiplaction table of %d is\n", num);

    printf(">>>>>>>>>First Method-------\n");
    for (int i = 0; i < 10; i++)
    {
        printf("%d X %d = %d\n", num, i + 1, (i + 1) * num);
    }

    printf(">>>>>>>>Second Method-------\n");
    for (int i = 1; i <= 10; i++)
    {
        printf("%d X %d = %d\n", num, i, i * num);
    }

    return 0;
}
