#include<stdio.h>

int main(){
    int d, m, y, isleap=1, checkDate=0;
    printf("Enter date month and year : ");
    scanf("%d %d %d", &d, &m, &y);
    // check leap year
    if(y%100!=0 && y%4==0 || y%400==0){
        isleap=1;
    }
    if(y>1850 && y<2050 && m>1 && m<12 && d>1 && d<31){
            checkDate=1;
    }
    // else if(m==2){
    //         if(d==30 || d==31 || d==29 && !isleap){
    //             flag=0;
    //         }
    // }
    // else if(m==4 || m==6 || m==9 || m==11){
    //     if(d==31){
    //         flag=0;
    //     }
    // }
    if(checkDate==0){
        printf("Not a valid date\n");
    }
    else
        printf("Valid Date\n");

    return 0;
}