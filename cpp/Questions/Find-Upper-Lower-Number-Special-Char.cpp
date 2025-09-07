// Check whether a given character is upper case, lower case, number or special character

#include <iostream>
using namespace std;

int main()
{
    char ch;
    cout << "Enter any character : ";
    cin >> ch;
    int newCh = int(ch);

    if (newCh >= 65 && newCh <= 90)
    {
        cout << ch << " is a upper case" << endl;
    }
    else if (newCh >= 97 && newCh <= 122)
    {
        cout << ch << " is a lower case" << endl;
    }
    else if (newCh >= 48 && newCh <= 57)
    {
        cout << ch << " is a number" << endl;
    }
    else
    {
        cout << ch << " is a special character" << endl;
    }

    return 0;
}