



// Q.4 --> Write a program to calculate simple interest for input values from user and representing principal number of years and rate of interest.
// #include <stdio.h>
// int main()
// {
//     int principal, rate, time;
//     printf("Enter the value of principal, rate and time\n");
//     scanf("%d %d %d", &principal, &rate, &time);
//     float si = (principal * rate * time) / 100;
//     printf("The simple interest of above input is %f \n", si);
//     return 0;
// }

// Q.5 --> Write a program to find out whether a student is pass or fail. If it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the users.
// #include <stdio.h>
// int main()
// {
//     int physics, chemistry, maths;
//     printf("Enter your examination number in three subject physics, chemistry and maths\n");
//     scanf("%d %d %d", &physics, &chemistry, &maths);
//     float total = (physics + chemistry + maths) / 3;
//     if (total <= 40 || physics <= 33 || chemistry <= 33 || maths <= 33)
//     {
//         printf("You are fail\n");
//     }
//     else
//     {
//         printf("you are pass\n");
//     }
//     return 0;
// }

// Q.6 --> Calculate income tax paid by an employee to the government as per the slabs mentioned below:
// Income slab      Tax
// 2.5 L - 5.0 L    5 %
// 5.0 L - 10.0 L   20%
// Above 10.0 L     30%
// Note:- That there is no tax below 2.5 L. Take income amount as an input from the user.
// #include <stdio.h>
// int main()
// {
//     int income;
//     printf("Plese enter your income \n");
//     scanf("%d", &income);
//     if (income >= 250000 && income<=500000)
//     {
//         printf("You are pay government tax = %f\n", (income - 250000) * 0.05);
//     }
//     else if (income >= 500000 && income<=1000000)
//     {
//         printf("You are pay government tax = %f\n", (income - 500000) * 0.20);
//     }
//     else if (income>= 1000000)
//     {
//         printf("You are pay net government tax = %f\n", (income - 1000000) * 0.30);
//     }
//     else
//     {
//         printf("you are not paid any tax because your income below 250000");
//     }

//     return 0;
// }

// Q.7 --> Write a program to find whether a year entered by the user is a leap year or not. Take year as an input from the user.
// #include <stdio.h>
// int main()
// {
//     int year;
//     printf("Enter year to check leap year or not\n");
//     scanf("%d", &year);
//     if (year % 400 == 0)
//     {
//         printf("%d is a leap year\n", year);
//     }
//     else if (year % 100 == 0)
//     {
//         printf("%d is not a leap year\n", year);
//     }
//     else if (year % 4 == 0)
//     {
//         printf("%d is a leap year\n", year);
//     }
//     else
//     {
//         printf("%d is not a leap year\n", year);
//     }
//     return 0;
// }

// Q.8 --> Write a program to determine whether a character entered by the user is lowercase or not.
// #include<stdio.h>

// int main(){
//     char character;
//     printf("Enter a character\n");
//     scanf("%c", &character);
//     if (character>=97 && character<=122){
//         printf("%c is a Lowercase\n", character);
//     }
//     else
//     {
//         printf("%c is not a Lowercase\n", character);
//     }

//     return 0;
// }

// Q.9 --> Write a program to find greatest of four numbers entered by the user.
// #include<stdio.h>

// int main(){
//     int num;
//     printf("Enter four digit number\n");
//     scanf("%d", &num);
//     num1 = num/1000;
//     num2 = num/100;
//     num3 = num/10
//     return 0;
// }

// Q.10 --> Write a program to check whether a number is divisible 97 or not.
// #include <stdio.h>

// int main()
// {
//     int number;
//     printf("Enter a number\n");
//     scanf("%d", &number);
//     if (number%97==0){
//         printf("%d divisible by 97\n", number);
//     }
//     else {
//         printf("%d not divisible by 97", number);
//     }
//     return 0;
// }

//Q.11 --> paper of size A0 has dimensions 1189 mm X 841 mm. Each subsequent size A(n) is defined as A(n-1) cut in half parallel to its shorter sides. Thus paper of size A1 would have dimensions 841 mm X 594 mm. Write a program to calculate and print paper sizes A0, A1, A2, ...A8.
