// 0000000000110111
// 1111111111001000 --> 1's complement
//               +1 --> 2's complement
// -----------------
// 1111111111001001


#include <stdio.h>

int main(void){
    int i = 0;
    unsigned int bit = 0;
    int j = 0;
    int b[16] = {0}; // Assuming your integer size is 16bit

    printf("input number :\n");
    scanf("%d", &i);

    bit = (unsigned int)i;

    for (j = 15; j >= 0; j--){
        b[j] = bit & 0x1;
        bit = bit >> 1;
    }

    for (j = 0; j <= 15; j++)
        printf("%d", b[j]);

    printf("\n");
    return 0;
}

// int main(void){
//         int i;
//         int j;
//         int b[16];
//         printf("input number :\n");
//         scanf("%d",&i);
//         if(i <= 0) {
//             // here is negative decimal code
//         } else {
//             for(j=15;j>=0;j--) {
//                 b[j] = i % 2;
//                 i = i / 2;
//             }
//             for (j=0;j<=15;j++)
//                 printf("%d", b[j]);
//             printf("\n");
//         }
//         return 0;
//     }