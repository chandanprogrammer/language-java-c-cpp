// Write a Program to implement Hierarchical inheritance as -
//         A
//       /   \
//      B     C
//     / \   / \
//    M  N   P  Q

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

class B : A
{
    int b1;

protected:
    int b2;

public:
    void readb();
    void printb();
};

class C : A
{
    int c1;

protected:
    int c2;

public:
    void readc();
    void printc();
};

class M : B
{
    int m1;

protected:
    int m2;

public:
    void readm();
    void printm();
};

class N : B
{
    int n1;

protected:
    int n2;

public:
    void readn();
    void printn();
};

class P : C
{
    int p1;

protected:
    int p2;

public:
    void readp();
    void printp();
};

class Q : C
{
    int q1;

protected:
    int q2;

public:
    void readq();
    void printq();
};

// Reading Function
void A ::reada()
{
    cout << "\nEnter a1, a2 : ";
    cin >> a1 >> a2;
}
void B ::readb()
{
    A ::reada();
    cout << "\nEnter b1, b2 : ";
    cin >> b1 >> b2;
}
void C ::readc()
{
    A ::reada();
    cout << "\nEnter c1, c2 : ";
    cin >> c1 >> c2;
}
void M ::readm()
{
    B ::readb();
    cout << "\nEnter m1, m2 : ";
    cin >> m1 >> m2;
}
void N ::readn()
{
    B ::readb();
    cout << "\nEnter n1, n2 : ";
    cin >> n1 >> n2;
}
void P ::readp()
{
    C ::readc();
    cout << "\nEnter p1, p2 : ";
    cin >> p1 >> p2;
}
void Q ::readq()
{
    C ::readc();
    cout << "\nEnter q1, q2 : ";
    cin >> q1 >> q2;
}

// Print Function
void A ::printa()
{
    cout << "\na1 = "<<a1;
    cout << "\na2 = "<<a2;
}
void B ::printb()
{
    A ::printa();
    cout << "\nb1 = "<<b1;
    cout << "\nb2 = "<<b2;
}
void C ::printc()
{
    A ::printa();
    cout << "\nc1 = "<<c1;
    cout << "\nc2 = "<<c2;
}
void M ::printm()
{
    B ::printb();
    cout << "\nm1 = "<<m1;
    cout << "\nm2 = "<<m2;
}
void N ::printn()
{
    B ::printb();
    cout << "\nn1 = "<<n1;
    cout << "\nn2 = "<<n2;
}
void P ::printp()
{
    C ::printc();
    cout << "\np1 = "<<p1;
    cout << "\np2 = "<<p2;
}
void Q ::printq()
{
    C ::printc();
    cout << "\nq1 = "<<q1;
    cout << "\nq2 = "<<q2;
}

// Main Function
int main(){
    M M2;
    M2.readm();
    M2.printm();
    N N2;
    N2.readn();
    N2.printn();
    P P2;
    P2.readp();
    P2.printp();
    Q Q2;
    Q2.readq();
    Q2.printq();

    // getch();
    return 0;
}