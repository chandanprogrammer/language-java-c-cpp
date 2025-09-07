/* Write a program to convert celcius (Centigrade degrees temperature to Farenheit. */

#include <stdio.h>

int main()
{
    int celcius = 37;
    float far = (celcius * 9 / 5) + 32;
    printf("The value of %d deg celcius convert into ferenhrit is equal to %f", celcius, far);
    return 0;
}