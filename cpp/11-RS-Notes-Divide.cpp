// Big Notes Divide into Small Notes

#include<iostream>  
using  namespace std;

int main(){
    int amount;
    cout<<"Plese Enter any Amount : ";
    cin>>amount;
    int hundred, fifty, twenty, ten, one;
        switch(1){
            case 1:
                hundred =amount/100;
                cout << "RS. 100 ka Notes --> " << hundred <<endl; 
                amount = amount- (hundred*100);
                // amount = amount % 100;
            case 2:
                fifty =amount/50;
                cout << "RS. 50 ka Notes ---> " << fifty <<endl; 
                amount = amount- fifty*50;
            case 3:
                twenty =amount/20;
                cout << "RS. 20 ka Notes ---> " << twenty <<endl; 
                amount = amount- twenty*20;
            case 4:
                ten =amount/10;
                cout << "RS. 10 ka Notes ---> " << ten <<endl; 
                amount = amount- ten*10;
            case 5:
                one =amount/1;
                cout << "RS. 1 ka Notes ---> " << one <<endl; 
                amount = amount- one*1;
                break;    
            default:
                cout<<"Invalid input "<< endl;
                break;
        }
}