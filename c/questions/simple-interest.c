/* Write a program to calculate simple interest for a set of values representing principal number of yours and rate of interest. */

#include <stdio.h>

int main()
{
    int principle = 999, rate = 4, time = 2;
    int si = (principle * rate * time) / 100;

    printf("The value of simple interest is %d\n", si);

    printf("Total amount return %d", principle + si);
    return 0;
}