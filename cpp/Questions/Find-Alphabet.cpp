// Check whether the given character is an alphabet or not | FACE Prep

#include <iostream>
using namespace std;

int main()
{
    char ch;
    cout << "Enter a character : ";
    cin >> ch;
    int newCh = int(ch);

    if (newCh >= 65 && newCh <= 90 || newCh >= 97 && newCh <= 122)
    {
        cout << ch << " is a character " << endl;
    }
    else
    {
        cout << ch << " is not a character " << endl;
    }

    return 0;
}