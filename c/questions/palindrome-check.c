/* Write a program to find whether a number is Palindrome or not */

#include <stdio.h>

int main()
{
    int num, reverseNum = 0, tempNum;
    printf("Enter a Number : ");
    scanf("%d", &num);

    int compNum = num;
    while (num != 0)
    {
        tempNum = num % 10;
        num = num / 10;
        reverseNum = reverseNum * 10 + tempNum;
    }
    if (compNum == reverseNum)
    {
        printf("Number is Palindrome !!");
    }
    else
    {
        printf("Number is Not Palindrome !!");
    }
    return 0;
}