#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin>>n;
    int size = (n*(n+1))/2;
    int fib[size+1];
    fib[0] = fib[1] = 1;
    for(int i=2;i<=size;i++) {
        fib[i] = fib[i-1]+fib[i-2];
    }
    int k=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<=i;j++) {
            cout<<fib[k++]<<" ";
        }
        cout<<endl;
    }
    return 0;
}
