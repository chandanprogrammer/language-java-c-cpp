//     1
//    232
//   34543
//  4567654
// 567898765
//  4567654
//   34543
//    232
//     1


#include <stdio.h>
int main(){
    int i, j, n = 5;
    for (i = 1; i <= n; i++){
        int p=i;
        for(j=1; j<=n-i; j++)
            printf(" ");
        for(j=1; j<=i; j++)
            printf("%d", p++);
        p=p-2;
        for(j=1; j<=i-1; j++)
            printf("%d", p--);
        printf("\n");
    }
    for (i = 1; i < n; i++){
        int p=n-i;
        for(j=1; j<=i; j++)
            printf(" ");
        for(j=1; j<=n-i; j++)
            printf("%d", p++);
        p=p-2;
        for(j=1; j<=n-i-1; j++)
            printf("%d", p--);
        printf("\n");
    }
}









