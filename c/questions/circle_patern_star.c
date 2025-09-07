// Write a Program in C to print circle pattern *.
#include <stdio.h>
#include <conio.h>
#include <math.h>

int main()
{
    int radius = 10;
    float dist;
    // for horizontal movement
    for (int i = 0; i <= 2 * radius; i++)
    {
        // for vertical movement
        for (int j = 0; j <= 2 * radius; j++)
        {
            dist = sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

            // dist should be in the range (radius - 0.5)
            // and (radius + 0.5) to print stars(*)
            if (dist > radius - 0.5 && dist < radius + 0.5)
                printf("*");
            else
                printf(" ");
        }
        printf("\n");
    }
    getch();
    return 0;
}
