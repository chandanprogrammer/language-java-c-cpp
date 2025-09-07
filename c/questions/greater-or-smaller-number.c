// Input numbers and check which number is greater or smaller.

#include<stdio.h>
#include<conio.h>

void main(){
    int n, v, g, s, i;
    printf("\nHow many number : \n");
    scanf("%d", &n);
    g=-32768;
    s=32767;
    for(i=1; i<=n; i++){
        printf("\nEnter No : ");
        scanf("%d", &v);
        if(v>g)
        g=v;
        if(v<s)
        s=v;
    }
    printf("greatest = %d , smallest = %d", g, s);
    getch();
}