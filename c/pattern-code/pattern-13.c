// *******
// *     *
// *     *
// *     *
// *     *
// *     *
// *******
#include<stdio.h>

int main(){
    int i, j, n=7;
    for(i=1; i<=n; i++){
        for(j=1; j<=n; j++){
            if(i==1 || i==n || j==1 || j==n){
                printf("*");
            }
            else
                printf(" ");
        }
        printf("\n");
    }
}


// By while loop method :

// int main(){
//     int n=5;
//     int i=1;
//     while(i<=n){
//         int j=1;
//         while(j<=n){
//             if(i==1 || i==n){
//                 printf("*");
//             }
//             else{
//                 if(j==1 || j==n){
//                     printf("*");
//                 }
//                 else{
//                     printf(" ");
//                 }
//             }
//             j++;
//         }
//         printf("\n");
//         i++;
//     }
// }