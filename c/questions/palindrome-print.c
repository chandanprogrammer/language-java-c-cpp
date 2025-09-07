/* Write a Program to display all four digit Palindromes. */
#include <stdio.h>

int main()
{
    for (int n = 1000; n <= 9999; n++)
    {
        int reverseNum = 0, tempNum, compNum = n, backupNum = n;
        while (backupNum != 0)
        {
            tempNum = backupNum % 10;
            backupNum = backupNum / 10;
            reverseNum = reverseNum * 10 + tempNum;
        }
        if (compNum == reverseNum)
        {
            printf("%d\t", compNum);
        }
    }
    getch();
    return 0;
}