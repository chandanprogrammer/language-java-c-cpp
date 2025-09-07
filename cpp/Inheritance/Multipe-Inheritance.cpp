// Write a Program to implement Multiple inheritance as -
//    A   B   C  D
//     \  \   /  /
//      \ \  / /
//         M

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

class B
{
    int b1;

protected:
    int b2;

public:
    void readb();
    void printb();
};

class C
{
    int c1;

protected:
    int c2;

public:
    void readc();
    void printc();
};

class D
{
    int d1;

protected:
    int d2;

public:
    void readd();
    void printd();
};

class M : A, B, protected C, protected D
{
    int m1;

protected:
    int m2;

public:
    void readm();
    void printm();
};

// Read Function
void A ::reada()
{
    cout << "\nEnter a1, a2 : ";
    cin >> a1 >> a2;
}
void B ::readb()
{
    cout << "\nEnter b1, b2 : ";
    cin >> b1 >> b2;
}
void C ::readc()
{
    cout << "\nEnter c1, c2 : ";
    cin >> c1 >> c2;
}
void D ::readd()
{
    cout << "\nEnter d1, d2 : ";
    cin >> d1 >> d2;
}

void M ::readm()
{
    reada();
    readb();
    readc();
    readd();
    cout << "\nEnter m1, m2 : ";
    cin >> m1 >> m2;
}

// Print Function
void A ::printa()
{
    cout << "\n a1 = " << a1;
    cout << "\n a2 = " << a2;
}
void B ::printb()
{
    cout << "\n b1 = " << b1;
    cout << "\n b2 = " << b2;
}
void C ::printc()
{
    cout << "\n c1 = " << c1;
    cout << "\n c2 = " << c2;
}
void D ::printd()
{
    cout << "\n d1 = " << d1;
    cout << "\n d2 = " << d2;
}

void M ::printm()
{
    printa();
    printb();
    printc();
    printd();
    cout << "\n m1 = " << m1;
    cout << "\n m2 = " << m2;
}

// Main Function 
int main(){
    M M2;
    M2.readm();
    M2.printm();
    // getch();

    return 0;
}