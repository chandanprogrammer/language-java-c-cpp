#include <stdio.h>
#include <windows.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    system("color 3F");
    int pin = 1234, option, enteredPin, count = 0, amount = 1;
    float balance = 5000;
    int continueTransaction = 1;

    // Display Time
    time_t now;
    time(&now);
    printf("\n\t\t\t  %s", ctime(&now));

    printf("\n\t\t ============= Welcome to ATM Banking =============");
    while (pin != enteredPin)
    {
        printf("\nPlease Enter your Pin : ");
        scanf("%d", &enteredPin);
        if (enteredPin != pin)
        {
            Beep(610, 500);
            printf("Invalid Pin !!");
        }
        count++;
        if (count == 3 && pin != enteredPin)
        {
            exit(0);
        }
    }

    while (continueTransaction != 0)
    {
        printf("\n\t\t\t ============*Available Transactions*============");
        printf("\n\n\t\t1.Withdrawl");
        printf("\n\n\t\t2.Deposit");
        printf("\n\n\t\t3.Check Balance");
        printf("\n\n\tPlease Select the option : ");
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            while (amount % 500 != 0)
            {
                printf("\n\t\t Please Enter the amount : ");
                scanf("%d", &amount);
                if (balance < amount)
                {
                    printf("\n\t\t Sorry insufficient balance");
                    amount = 1;
                    break;
                }
                else
                {
                    balance -= amount;
                    printf("\n\t\t You have withdraw Rs.%d. Your new balance is %.2f", amount, balance);
                    amount = 1;
                    break;
                }
            }
        case 2:
            printf("\n\t\t Please Enter the amount : ");
            scanf("%d", &amount);
            balance += amount;
            printf("\n\t\t You have Deposited Rs.%d. Your new balance is %.2f", amount, balance);
            amount = 1;
            break;
        case 3:
            printf("\n\t\t Your balance is Rs.%2f", balance);
            break;
        default:
            Beep(610, 500);
            printf("\n\t\tInvalid Option !!");
            break;
        }
        printf("\n\t\tDo you wish to perform another transaction? Press 1[Yes], 0[No] : ");
        scanf("%d", &continueTransaction);
    }
    return 0;
}