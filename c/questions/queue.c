// W.A.P to perform the following operation on simple queue using array.
// 1. Enqueue
// 2. Dequeue
// 3. Display
// 4. Reverse display

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

#define size 10
int info[size];
int front = -1;
int rear = -1;

void enqueue(){
    int x;
    if(rear==size-1){
        printf("\nSimple queue is full.");
        return ;
    }
    printf("\nEnter a value : ");
    scanf("%d", &x);
    rear++;
    info[rear]=x;
}