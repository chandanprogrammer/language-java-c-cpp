#include<iostream>
using namespace std;

int main(){
    char ch;
    cout<<"Please enter any character : ";
    cin>>ch;
    int check=ch;
    if(check>=97 && check<=122){
        cout<<"Your char is lowercase"<<endl;
    }
    else if(check>=65 && check<=90){
        cout<<"Your char is uppercase"<<endl;
    }
    else if(check>=48 && check<=57){
        cout<<"Your char is Numeric"<<endl;
    }
    else{
        cout<<"Invalid Input"<<endl;

    }
}