/* Write a program to read roll number and marks of 10 students in 3 subjects. The valid range for roll numbers is 1000-9999, if then roll number entered is not in this range, the user should be asked to enter again. Calculate total marks of only those students who get more than or equal to 40 marks in each subject. Count the number of students whose total is more than 200. Print the roll number of the student who gets the highest total. */

#include <stdio.h>
int main()
{
    int roll, marks, che, phy, math, studentNum = 4, count = 0, highest = 0, highRoll;
    for (int i = 1; i <= studentNum; i++)
    {
    againRoll:
        printf("\nEnter Your Roll No : ");
        scanf("%d", &roll);
        if (roll >= 1000 && roll <= 9999)
        {
            printf("Enter Marks of three subject out of 100 : ");
            scanf("%d %d %d", &che, &phy, &math);
            if (che >= 40 || phy >= 40 || math >= 40)
            {
                int total = che + phy + math;
                if (total >= 200)
                {
                    count++;
                }
                if (total > highest)
                {
                    highest = total;
                    highRoll = roll;
                }
            }
        }
        else
        {
            printf("Invalid Roll ! Again ");
            goto againRoll;
        }
    }
    printf("\nTotal Number of student more than 200 is : %d", count);
    printf("\nRoll Number of High Score Student : %d", highRoll);
}