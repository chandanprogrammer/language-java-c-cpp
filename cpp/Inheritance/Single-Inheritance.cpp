#include <iostream>
using namespace std;

class A
{
    int a1;

protected:
    int a2;

public:
    void reada();
    void printa();
};
class B : private A
{
    int b1;

protected:
    int b2;

public:
    void readb();
    void printb();
};
class C : private B
{
    int c1;

protected:
    int c2;

public:
    void readc();
    void printc();
};
class D : private C
{
    int d1;

protected:
    int d2;

public:
    void readd();
    void printd();
};

// Reading Function
void A :: reada()
{
    cout << "\nEnter a1, a2 : ";
    cin >> a1 >> a2;
}
void B :: readb()
{
    reada();
    cout << "\nEnter b1, b2 : ";
    cin >> b1 >> b2;
}
void C :: readc()
{
    readb();
    cout << "\nEnter c1, c2 : ";
    cin >> c1 >> c2;
}
void D :: readd()
{
    readc();
    cout << "\nEnter d1, d2 : ";
    cin >> d1 >> d2;
}

// Printing Function
void A :: printa()
{
    cout<<"\na1 = "<<a1;
    cout<<"\na2 = "<<a2;
}
void B :: printb()
{
    printa();
    cout<<"\nb1 = "<<b1;
    cout<<"\nb2 = "<<b2;
}
void C :: printc()
{
    printb();
    cout<<"\nc1 = "<<c1;
    cout<<"\nc2 = "<<c2;
}
void D :: printd()
{
    printc();
    cout<<"\nd1 = "<<d1;
    cout<<"\nd2 = "<<d2;
}

// Main Function
int main(){
    D D2;
    D2.readd();
    D2.printd();
    // getch();
    return 0;
}