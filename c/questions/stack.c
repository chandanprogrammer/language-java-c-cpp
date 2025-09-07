// W.A.P to perform the following operation stack using array.
// 1. Push
// 2. Pop
// 3. Peep
// 4. Inverse peep

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

#define size 6
int info[size];
int top = -1;

void push()
{
    int x;
    if (top == size - 1)
    {
        printf("\n Stack is Full.");
        return;
    }
    printf("\n Enter a Value : ");
    scanf("%d", &x);
    top++;
    info[top] = x;
}

void pop()
{
    int x;
    if (top == -1)
    {
        printf("\n Stack is Empty.");
        return;
    }
    x = info[top];
    top--;
    printf("\n Poped no. = %d", x);
}

void peep()
{
    int i;
    if (top == -1)
    {
        printf("\n Stack is Empty.");
        return;
    }
    printf("\n Content of stack \n");
    for (i = top; i >= 0; i--)
    {
        printf("%4d", info[i]);
    }
}

void rev_peep()
{
    int i;
    if (top == -1)
    {
        printf("\n Stack is Empty.");
        return;
    }
    printf("\n Content of stack reverse \n");
    for (i = 0; i <= top; i++)
    {
        printf("%4d", info[i]);
    }
}

void main()
{
    int ch;
    do
    {
        // clrscr();
        printf("\n1.Push \n2.Pop \n3.Peep \n4.rev_peep \n0.Exit");
        printf("\nEnter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peep();
            break;
        case 4:
            rev_peep();
            break;
        case 0:
            exit(0);
        }
        getch();
    } while (2);
}