#include <stdio.h>
#include <conio.h>

int main(){
//  char name[5];
 int roll[5];
//  struct course[20];
 
 for (int i=0; i<5; i++)
 {
    //  printf("Enter your Name:\n");
    //  gets(name[i]);
    //  scanf("%s", &name[i]);
     printf("Enter your Roll No:\n");
     scanf("%d", &roll[i]);
 }
 for (int i = 0; i < 5; i++)
 {
    //  printf("Name: %s", name[i]);
     printf("Roll No: %d \t", roll[i]);
 }

    getch();
    return 0;
}