/* Write a program to check wheteher a number is divible by 97 or not. */

#include <stdio.h>

int main()
{
    int num;
    printf("Enter the any number:\n");
    scanf("%d", &num);
    printf("Diviblity test return: %d \n", num % 97);
    return 0;
}

// If remander is Zero then number is divisible by 97.