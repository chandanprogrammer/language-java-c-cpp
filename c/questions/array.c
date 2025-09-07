#include <stdio.h>

void swap(int *x, int *y)
{
    int t;
    printf("Starting x = %d y =%d \n", *x, *y);
    t = *x;
    *x = *y;
    *y = t;
    printf("Ending x = %d y =%d \n", *x, *y);
}

void main()
{
    int a = 10, b = 20;
    printf("Starting a = %d b =%d \n", a, b);
    swap(&a, &b);
    printf("Ending a = %d b =%d \n", a, b);

}

// #include <stdio.h>

// void change(int x)
// {
//     printf("starting value of x = %d \n", x);
//     x = x + 100;
//     printf("ending value of x = %d \n", x);
// }

// void main()
// {
//     int n = 25;
//     printf("starting value of n = %d \n", n);
//     change(n);
//     printf("ending value of x = %d \n", n);
// }