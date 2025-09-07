/* Calculate the area of a circle and Modify the same program to calculate the volume of a cylinder given its radius and height. */

#include <stdio.h>

int main()
{
    float radius = 4, pi = 3.14;
    float area = pi * radius * radius;
    printf("The area of circle is %f cm square\n", area);
    float height=2;
    printf("The volume of cylinder %f cm cube\n", area*height);
    return 0;
}