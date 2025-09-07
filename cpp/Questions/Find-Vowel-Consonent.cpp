// Given a character, to find out if that character is a vowel or consonant can be done in two ways.

// Problem : To accept a character from user and find out character is vowel or consonant.

#include <iostream>
using namespace std;

int main()
{
    char ch;
    cout << "Enter any character : ";
    cin >> ch;
    // 97-122 65-90
    int newCh = int(ch);
    // cout<<newCh<<endl;

    if (newCh >= 97 && newCh <= 122 || newCh >= 65 && newCh <= 90)
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            cout << ch << " is a vowel";
        }
        else
        {
            cout << ch << " is a consonant";
        }
    }
    else
    {
        cout << ch << " is a invalid character";
    }
}

// int main()
// {
//     char ch;
//     cout << "Enter any character : ";
//     cin >> ch;
//     switch (ch)
//     {
//     case 'a':
//     case 'e':
//     case 'i':
//     case 'o':
//     case 'u':
//     case 'A':
//     case 'E':
//     case 'I':
//     case 'O':
//     case 'U':
//         cout << ch << " is a vowel";
//         break;
//     default:
//         cout << ch << " is a consonant";
//     }
//     return 0;
// }