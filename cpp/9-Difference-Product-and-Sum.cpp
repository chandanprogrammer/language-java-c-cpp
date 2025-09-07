 #include <iostream>
using namespace std;
int main(){
        int n=100, product=1, sum=0;
        while(n!=0){
            int rem = n%10;
            product=product*rem;
            sum=sum+rem;
            n=n/10;
        }
        int result=product-sum;
        cout<<result;
}