// Convert Binary Number to Decimal Number
#include <iostream>
using namespace std;

// int main()
// {
//     int num;
//     cout << "Enter a Binary Number : ";
//     cin >> num;
//     int ans = 0, power = 1;
//     while (num > 0)
//     {
//         int lastDigit = num % 10;
//         ans += lastDigit * power;
//         power *= 2;
//         num /= 10;
//     }
//     cout << "Decimal Number : " << ans;
//     return 0;
// }

// Convert Decimal Number to Binary Number

int main()
{
    int num;
    cout << "Enter a Decimal Number : ";
    cin >> num;
    int ans = 0, power = 1;
    while (num > 0)
    {
        int remender = num % 2;
        ans += remender * power;
        power *= 10;
        num /= 2;
    }
    cout << "Binary Number : " << ans;

    return 0;
}