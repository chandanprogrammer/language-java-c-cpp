#include <stdio.h>

int main()
{
    int i, a = 0, b = 1, c;
    {
        printf("%d ", a);
        c=a+b;
        a=b;
        b=c;
    }
    return 0;
}

// #include <stdio.h>

// int main()
// {
//     int i, n, p = 1;
//     printf("enter any positive number");
//     scanf("%d", &n);
//     for (i = 2; i <= n / 2; i++)
//         ;
//     {
//         if (n % i == 0)
//         {
//             p = 0;
//             break;
//         }
//     }
//     return 0;
// }

// #include <stdio.h>
// int main()
// {
//     int a, b, c;
//     printf("Enter three number\n");
//     scanf("%d %d %d", &a, &b, &c);
//     if (a < b && a < c)
//         // {
//         printf("smallest number is %d", a);
//     // }
//     else if (b < a && b < c)
//         // {
//         printf("smallest number is %d", b);
//     // }
//     else if (c < a && c < b)
//         // {
//         printf("smallest number is %d", c);
//     // }
//     else
//         // {
//         printf("Numbers are equal");
//     // }
//     return 0;
// }

// #include <stdio.h>
// int main()
// {
//     int s = 4, i, j, x;
//     for (i = 1; i <= 9; i += 2)
//     {
//         for (x = 1; x <= s; x++)
//         {
//             printf(" ");
//             s--;
//         }
//         for (j = 1; j <= i; j++)
//         {
//             if (j == 1 || j == i || i == 9)
//             {
//                 printf("*");
//             }
//             else
//             {
//                 printf(" ");
//             }
//         }
//         printf("\n");
//     }
//     return 0;
// }

// #include<stdio.h>
// int main(){
//     float r, x=3.5;
//     // r=x*x+2*x+1/2*x*x+x+1;
//     // r=3.5*3.5+2*3.5+1/2*3.5*3.5+3.5+1;
//     // r=12.25+7.0+0.5*3.5*3.5+4.5;
//     // r=12.25+7.0+6.125+4.5;
//     // 29.875
//     r=x*x+2*x+0.5*x*x+x+1;
//     printf("%f", r);
//     return 0;
// }

// #include<stdio.h>
// #include<conio.h>
// int main(){
//     int i;
//     for (i=65; i<=70; i++){
//         printf("%c", i);
//     }
//     getch();
//     return 0;
// }