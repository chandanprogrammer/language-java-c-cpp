#include<stdio.h>
#include<stdlib.h>

int timeUpdate(){
    int h, m, s, i=0;
    printf("\n\nEnter time formate in HH:MM:SS \n");
    scanf("%d %d %d", &h, &m, &s);
    start:
    for(h; h<24; h++){
        for(m; m<60; m++){
            for(s; s<60; s++){
                system("cls");
                printf("\n\n\n\n\n\n\t\t HH:MM:SS - %.2d:%.2d:%.2d",h,m,s);
                if(h<12?printf(" AM"):printf(" PM"));
                // delay(60);
                for(double i=0; i<3619999; i++){ 
                    for(double i=0; i<60; i++){   
                    }  
                }
            }
            s=0;
        }
        m=0;
    }
    h=0;
    goto start;
}

int main(){
    timeUpdate();
}