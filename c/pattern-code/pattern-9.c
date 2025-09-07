// 5        5
// 54      45
// 543    345
// 5432  2345
// 5432112345
#include <stdio.h>

int main()
{
    int i, j;
    for (i = 1; i <= 5; i++)
    {
        int x = 6 - i;
        int y = 6 - i;
        for (j = 5; j >= 1; j--)
        {
            if (j >= x)
            {
                printf("%d", j);
            }
            else
            {
                printf(" ");
            } 
        }
        for (j = 1; j <= 5; j++)
        {
            if (j >= y)
            {
                printf("%d", j);
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}