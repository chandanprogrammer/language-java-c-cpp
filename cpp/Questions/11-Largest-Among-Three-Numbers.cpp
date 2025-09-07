// 11. Find the largest among three numbers in C++.

#include <iostream>
using namespace std;

// to input three number from user
int num1, num2, num3;
int inputNumber(){
    cout<<"Enter first number : ";
    cin>>num1;
    cout<<"Enter second number : ";
    cin>>num2;
    cout<<"Enter third number : ";
    cin>>num3;
    return num1, num2, num3;
}

// Function work find largest number and print largest number.
void findNumber(int num1, int num2, int num3){
    if (num1 >= num2 && num1 >= num3)
    {
        cout << "Largest Number is " << num1 << endl;
    }
    else if (num2 >= num1 && num2 >= num3)
    {
        cout << "Largest Number is " << num2 << endl;
    }
    else if (num3 >= num1 && num3 >= num2)
    {
        cout << "Largest Number is " << num3 << endl;
    }
    else
    {
        cout << "Invalid" << endl;
    }
}

int main()
{
    // int num1 = 224, num2 = 224, num3 = 224;
    inputNumber();
    findNumber(num1, num2, num3);
    return 0;
}
