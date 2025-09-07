#include <stdio.h>
#include <stdlib.h>

int main(){
    FILE *ptr;
    int num;
    printf("Number : ");
    scanf("%d", &num);
    ptr=fopen("sample.txt", "w");
    for(int i=1; i<=10; i++){
        fprintf(ptr, "%d x %d = %d \n", num, i, num*i);
    }    
    fclose(ptr);
    return 0;
}