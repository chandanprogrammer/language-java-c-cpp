/* Write a c programming to calculate area of a rectangle-
(a) Using heard coded inputs
(b) Using inputs supplied by the user. */


#include <stdio.h>
int main(){


    int length = 4, breadth = 7;
    int area = length * breadth;
    printf("The area of rectangle is %d \n", area);

// Second 
    int lenght1, breadth1;
    printf("Enter the lenght of rectangle\n");
    scanf("%d", &lenght1);

    printf("Enter the breadth of rectangle\n");
    scanf("%d", &breadth1);
    printf("The area of rectangle is %d", lenght1 * breadth1);

    return 0;
}
