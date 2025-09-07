// Store Books Information 
#include<stdio.h>
#include<string.h>

struct books{
    char book_name[20];
    float price;
    int no_of_pages;
    char publisher_name[20];
}book[20];

void main(){
    int choice;
    printf("How many book insert : ");
    scanf("%d", &choice);
    for(int i=0; i<choice; i++){
        printf("\nEnter Book Name : ");
        scanf("%s", book[i].book_name);
        
        printf("\nEnter Book Price : ");
        scanf("%f", &book[i].price);

        printf("\nEnter Book Pages : ");
        scanf("%d", &book[i].no_of_pages);
        
        printf("\nEnter Book Publisher Name : ");
        scanf("%s", book[i].publisher_name);
    }
    printf("\n__________________________________________");
    printf("\nBook Name | Price | Pages | Publisher Name");
    printf("\n__________________________________________");
    for(int i=0; i<choice; i++){
        printf("\n%s\t %.2f\t %d\t %s", book[i].book_name, book[i].price, book[i].no_of_pages, book[i].publisher_name);
    }
}



