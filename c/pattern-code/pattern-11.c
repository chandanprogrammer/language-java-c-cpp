// * * * * *
//  * * * * *
// * * * * *
//  * * * * *
// * * * * *
#include <stdio.h>
int main(){
    int i, j, n = 5;
    for (i = 1; i <= n; i++){
        if (i % 2 == 0){
            printf(" ");
            for (j = 1; j <= n; j++){
                printf("* ");
            }
        }
        else{
            for (j = 1; j <= n; j++){
                printf("* ");
            }
        }
        printf("\n");
    }
}

