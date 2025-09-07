// Graphics type problem

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<dos.h>
#include<math.h>
// #include<graphics.h>
#include<string.h>
#include<process.h>
// #include<alloc.h>
#include<ctype.h>


void main(){
    int n, i, a, b, r, x, y;
    int gd = DETECT, gm;
    printf("\n Enter a, b:");
    scanf("%d %d", &a, &b);
    r=a>b?a:b;
    initgraph(&gd, &gm, " ");
    clearviewport();
    for ( i = 0; i < 360; i++)
    {
        setcolor(random(16));
        x=320+a*cos(3.14*i/180);
        y=240+b*sin(3.14*i/180);
        outtextxy(x, y, "*");
        x=320+b*cos(3.14*i/180);
        y=240+a*sin(3.14*i/180);
        outtextxy(x, y, "*");
        x=320+r*cos(3.14*i/180);
        y=240+r*sin(3.14*i/180);
        outtextxy(x, y, "*");
        delay(10);
    }
    getch();
    
}