// Write a Program to find Roots of a Quadatic Equation. [ ax^2+bx+c=0 ]
#include<stdio.h>
#include<conio.h>
#include<math.h>

int main(){
    float a, b, c, d, root1, root2;
    // clrscr();
    printf("Enter the value of a, b and c : \n");
    scanf("%f %f %f", &a, &b, &c);
    d = b*b-4*a*c;
    if (d==0){
        root1=root2=-b/(2*a);
        printf("Roots of Quadatic Equation are : \n Roots1 = %2f \n Roots2 = %2f", root1, root2);
    }
    else if (d>0){
        root1 = (-b + sqrt(d)/(2*a));
        root2 = (-b - sqrt(d)/(2*a));
        printf("\n Roots of Quadatic Equation are : \n Roots1 = %2f \n Roots2 = %2f", root1, root2);
    }
    else{
        printf("\n Given Equation are Complex");
    }
    getch();
    return 0;
}